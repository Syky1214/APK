/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delaunay;
import Delaunay.Algorithms;



/**
 *
 * @author jethro
 */
public class Triangle {
    Point3D p1;
    Point3D p2;
    Point3D p3;
    
    
    public Triangle(Point3D ap1, Point3D ap2, Point3D ap3){
        p1 = ap1;
        p2 = ap2;
        p3 = ap3;
    }
    
    //vypocet normaly
    public Point3D getNormalVec(){
        double denom = Algorithms.det3(p1.getX(),p1.getY(),p2.getX(),p2.getY(),p3.getX(),p3.getY());
        double noma = Algorithms.det3(p1.getY(), p1.getZ(), p2.getY(), p2.getZ(), p3.getY(), p3.getZ());
        double nomb = Algorithms.det3(p1.getX(), p1.getZ(), p2.getX(), p2.getZ(), p3.getX(), p3.getZ()); 
        //Point3D norm = new Point3D(noma/denom, nomb/denom, denom/denom);
        
        
        double nomc = Algorithms.det3(p1.getX(), p1.getY(), p2.getX(),p2.getY(), p3.getX(), p3.getY());

        // point representing vector
        Point3D norm = new Point3D(noma / denom, nomb / denom, nomc / denom);
        return norm;
    }
    
    //sklon
    public  double getSlope() {
        return Algorithms.angle(this.getNormalVec(), new Point3D(0, 0, 1));
    }
    
    //vypocet expozicie
    public double getExp(){
        Point3D norm = getNormalVec();
       double exp =  Math.atan(norm.getY()/norm.getX());
       if(norm.getX()<0){
           exp +=Math.PI;
       }
       return exp+Math.PI/2;
    }
    
    
    
    
}

