/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delaunay;

import java.util.List;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import static java.lang.Math.abs;
import static java.lang.Math.acos;
import static java.lang.Math.atan2;
import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jethro
 */
public class Algorithms {
    public static final double EPSILON = 0.000001;
    
    public enum PositionEnum {INSIDE,OUTSIDE,BOUNDARY}
    public enum OrientationEnum {CW,COLINEAR,CCW}
    
    public static OrientationEnum getOrientation(Point2D p1, Point2D p2, Point2D p3){
         double val = (p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) - 
                  (p2.getX() - p1.getX()) * (p3.getY() - p2.getY()); 
         if (abs(val) < EPSILON){
             return OrientationEnum.COLINEAR;
         }else if (val > 0){
             return OrientationEnum.CW;
         }else {
             return OrientationEnum.CCW;
         } 
    }
    
    public static OrientationEnum getOrientation(Point3D p1, Point3D p2, Point3D p3){
        return getOrientation(p1.toPoint2D(), p2.toPoint2D(), p3.toPoint2D());
    }
    
    public static double dotProd(double ux, double uy, double vx, double vy){
        return ux*vx + uy*vy;
    }
    
    public static double dotProd(Point3D u, Point3D v){
        return u.getX()*v.getX()+u.getY()*v.getY()+u.getZ()*v.getZ();
        
    }
    
    
    public static double len(double ux, double uy){
        return sqrt(ux*ux + uy*uy);
    }
    
    public static double len(Point3D v){
        return sqrt(v.getX()*v.getX()+v.getY()*v.getY()+v.getZ()*v.getZ());
    }
    
    
    
    public static double dotProdNorm(double ux, double uy, double vx, double vy){
        double prod = dotProd(ux, uy, vx, vy);
        double ulen = len(ux,uy);
        double vlen = len(vx,vy);
        return prod/(ulen*vlen);
    }
    
    public static double angle(double ux, double uy, double vx, double vy){
        return acos(dotProdNorm(ux,uy,vx,vy));
    }
    
    public static double angle(Point3D u,Point3D v){
        return acos(dotProd(u,v)/(len(u)*len(v)));
    }
    
    
    public static double distanceFromLine(Point2D start, Point2D end, Point2D pt){
        double nom;
        double denom;
        
        nom = abs((end.getY()-start.getY())*pt.getX() - 
                  (end.getX()-start.getX())*pt.getY() +
                  end.getX()*start.getY() - 
                  end.getY()*start.getX());
        denom = sqrt((end.getY()-start.getY())*
                     (end.getY()-start.getY())+
                     (end.getX()-start.getX())*
                     (end.getX()-start.getX()));
        return nom/denom;
    }
    
    public static double dist(Point3D p1, Point3D p2){
        return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX()) + 
                         (p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
    }
    
    /*public static double circleRadiusOld(Point2D p1, Point2D p2, Point2D p3){
        double x1 = p1.getX();  double x2 = p2.getX();  double x3 = p3.getX();
        double y1 = p1.getY();  double y2 = p2.getY();  double y3 = p3.getY();

        double mr = (y2-y1) / (x2-x1);
        double mt = (y3-y2) / (x3-x2);

        if (mr == mt) {
            return Double.NaN;
        }

        double x = (mr*mt*(y3-y1) + mr*(x2+x3) - mt*(x1+x2)) / (2*(mr-mt));
        double y = (y1+y2)/2 - (x - (x1+x2)/2) / mr;
        
        double radius = dist(new Point2D.Double(x,y), p2);
        return radius;
    }*/
    
    public static double circleRadius(Point3D p1, Point3D p2, Point3D p3){
        double x1 = p1.getX();  double x2 = p2.getX();  double x3 = p3.getX();
        double y1 = p1.getY();  double y2 = p2.getY();  double y3 = p3.getY();

        double k1 = x1*x1 + y1*y1;
        double k2 = x2*x2 + y2*y2;
        double k3 = x3*x3 + y3*y3;
        double k4 = y1-y2;
        double k5 = y1-y3;
        double k6 = y2-y3;
        double k7 = x1-x2;
        double k8 = x1-x3;
        double k9 = x2-x3;
        double k10 = x1*x1;
        double k11 = x2*x2;
        double k12 = x3*x3;
                
        double mnom = (k12*(-k4)+k11*k5-(k10+k4*k5)*k6);
        double mdenom = (-k4)*x3+x2*k5+x1*(-k6);
        double m = 0.5*mnom/mdenom;
        
        double nnom = k1*(-k9)+k2*k8+k3*(-k7);
        double ndenom = y1*(-k9)+y2*k8+y3*(-k7);
        
        double n = 0.5*nnom/ndenom;
        
        Point3D middle = new Point3D(m,n,0);
        
        double radius = dist(middle, p2);
        
        if (getOrientation(p1, p2, middle) == OrientationEnum.CW){
            radius = -radius;
        }
        
        
        return radius;
    }
    
    public static Point3D minimalBoundingCircle(Edge e,Point3D [] points){
        Point3D minPoint = null;
        double minradius = Double.MAX_VALUE;
        
        for (Point3D p : points){
            if (p == e.p1 || p == e.p2){
                continue;
            }
            

            if (getOrientation(e.p1, e.p2, p) != OrientationEnum.CCW){
                continue;
            }
            
            double radius = circleRadius(e.p1, e.p2, p);
            
            
            
            if (radius < minradius ){
                minPoint = p;
                minradius = radius;
            }
            
            
        }
        return minPoint;
    }
    
    private static void addToAel(List<Edge> ael,Edge edge){
        Iterator<Edge> it = ael.iterator();
        Edge swapped = edge.swappedEdge();
        System.out.print("Swapped:");
        System.out.println(swapped);
        
        while (it.hasNext()){
            Edge e;
            e = it.next();
            if (e.equals(swapped)){
                it.remove();
                System.out.print("Existing anti-edge found, removing: ");
                System.out.println(e);
                return;
            }
        }
        System.out.println("Edge not found, adding...");
        ael.add(edge);  
    }
    
    public static List<Triangle> delaunay(Point3D[] points){
        List<Triangle> dt = new LinkedList<>();
        
        Point3D p1 = points[0];
        Point3D p2 = null;
        double mindist = Double.MAX_VALUE;
        for (Point3D p: points){
            if (p == p1){
                continue;
            }
            if (dist(p1,p) < mindist){
                p2 = p;
                mindist = dist(p1,p);
            }
        }
        Edge e = new Edge(p1,p2);
        Point3D p = minimalBoundingCircle(e, points);
        
        Edge e2;
        Edge e3;
        
        if (p == null){
            e.swap();
            //Edge erev = new Edge(p2,p1);
            p = minimalBoundingCircle(e, points);
            e2 = new Edge(p1,p);
            e3 = new Edge(p,p2);
        } else {
            e2 = new Edge(p2,p);
            e3 = new Edge(p,p1);
        }
        if (p == null){
            System.out.println("Nemam bod!");
      
        }
        
        dt.add(new Triangle(p1, p2, p));
        
        //Set<Edge> ael;
        List<Edge> ael;
        //ael = new HashSet<>();
        ael = new LinkedList<>();
        
        ael.add(e);
        ael.add(e2);
        ael.add(e3);
        
        while (!ael.isEmpty()){
            System.out.format("Fronta: %d\n", ael.size());
            Iterator<Edge> it = ael.iterator();
            e = it.next();
            it.remove();
            
            e.swap();
            
            p = minimalBoundingCircle(e, points);
            System.out.format("p = %h\n",p);
            System.out.println(e);
            if (p == null){
                continue;
            }
            
            e2 = new Edge(e.p2, p);
            e3 = new Edge(p,e.p1);
            
            dt.add(new Triangle(e.p1, e.p2, p));
            
            
            addToAel(ael, e3);
            addToAel(ael, e2);

        }

        return dt;
    }
    
    public static List<Point3D> calcContourPoints(Point3D p1, Point3D p2, double z){
        Point3D lower;
        Point3D upper;
        if (p1.getZ() < p2.getZ()) {
            lower = p1;
            upper = p2;
        } else {
            lower = p2;
            upper = p1;
        }

        double dh = upper.getZ() - lower.getZ();//rozdiel vysky
        double d = dist(lower, upper);

        List<Point3D> pts;
        pts = new LinkedList<>();
        
        double tmp = Math.floor(lower.getZ() / z);
        double dhtoCont = z - (lower.getZ() - (tmp * z));
        int k = 0;
        while (k * z + lower.getZ()+dhtoCont < upper.getZ()) {
            
             // Kolik mi chybí k nejbližší vrstevnici        
            double scale = (dhtoCont + z * k) / dh;
            double x = (upper.getX() - lower.getX()) * scale + lower.getX(); // posunu do 0, škáluji, posunu zpět
            double y = (upper.getY() - lower.getY()) * scale + lower.getY(); // posunu do 0, škáluji, posunu zpět           
            pts.add(new Point3D(x, y, lower.getZ() + dhtoCont + z * k));
            k++;
        }
        return pts;
    }
    
    public static List<Edge> calcContours(Triangle t, double interval){
        List<Edge> edges;
        edges = new LinkedList<>();
        
        List<Point3D> ptsp1p2;
        List<Point3D> ptsp2p3;
        List<Point3D> ptsp3p1;
        
        ptsp1p2 = calcContourPoints(t.p1, t.p2, interval);
        ptsp2p3 = calcContourPoints(t.p2, t.p3, interval);
        ptsp3p1 = calcContourPoints(t.p3, t.p1, interval);

        for (Point3D p: ptsp1p2){
            for (Point3D p2: ptsp2p3){
                if (p.getZ() == p2.getZ()){
                    edges.add(new Edge(p,p2));
                }
            }
            for (Point3D p2: ptsp3p1){
                if (p.getZ() == p2.getZ()){
                    edges.add(new Edge(p,p2));
                }
            }
        }
        for (Point3D p: ptsp2p3){
            for (Point3D p2: ptsp3p1){
                if (p.getZ() == p2.getZ()){
                    edges.add(new Edge(p,p2));
                }
            }
        }
        
        
        
          
        return edges;
    }
    
    public static List<Edge> calcContours(List<Triangle> tl, double interval){
        List<Edge> edges;
        edges = new LinkedList<>();
        for (Triangle t: tl){
            List<Edge> tedges;
            tedges = calcContours(t, interval);
            edges.addAll(tedges);
        }
        return edges;
    }
    //vypocet determinantu
     public static double det3(double a1,double b1,double a2,double b2,double a3,double b3){
        double a,b,c,d,e,f,g,h,i;
        a= a1;
        b= b1;
        c= 1;
        d = a2;
        e= b2;
        f =1;
        g = a3;
        h= b3;
        i=1;
        double det  = a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
        return det;
    }
     
     
    
}
