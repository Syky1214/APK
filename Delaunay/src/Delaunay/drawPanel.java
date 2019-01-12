/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delaunay;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jethro
 */
public class drawPanel extends javax.swing.JPanel {
    
    Point2D [] points2d;
    Point3D [] points;
    List<Edge> edges;
    List<Triangle> triangles;
    Path2D triangulation;
    boolean expositionCalc ;
    boolean slopeCalc ;
    
    

    /**
     * Creates new form drawPanel
     */
    public drawPanel() {
        points = new Point3D[0];
        points2d = new Point2D[0];
        triangulation = new Path2D.Double();
        edges = new LinkedList<>();
        triangles = new LinkedList<>();
        expositionCalc = false;
        slopeCalc = false;
        initComponents();
    }
    
    @Override
    public void paintComponent(Graphics g){
        System.err.println("Repainting...");
        super.paintComponent(g);
        Graphics2D gfx = (Graphics2D)g;
        
        int width;
        int height;
        
        width = this.getWidth();
        height = this.getHeight();
            
       
        gfx.setColor(Color.BLACK);
        
        for (int i=0;i<points.length;i++){
            int x;
            int y;
            x = (int)(points[i].getX()*width);
            y = (int)((1-points[i].getY())*height);
//            System.out.println(points[i].getX());
//            System.out.println(x);

            gfx.drawLine(x-5, y-5, x+5, y+5);
            gfx.drawLine(x-5, y+5, x+5, y-5);

        }
        
        //generovanie gridu 2D
        for (int i=0;i<points2d.length;i++){
            int x;
            int y;
            x = (int)(points2d[i].getX()*width);
            y = (int)((1-points2d[i].getY())*height);
//            System.out.println(points[i].getX());
//            System.out.println(x);

            gfx.drawLine(x-5, y-5, x+5, y+5);
            gfx.drawLine(x-5, y+5, x+5, y-5);

        }
        
        int i=255;
        triangulation = new Path2D.Double();
        
        for (Triangle t: triangles){
            gfx.setColor(Color.black);
            //gfx.setStroke(new BasicStroke(2));
            Path2D epath = new Path2D.Double();
            epath.moveTo(t.p1.getX(), t.p1.getY());
            epath.lineTo(t.p2.getX(), t.p2.getY());
            epath.lineTo(t.p3.getX(), t.p3.getY());
            epath.lineTo(t.p1.getX(), t.p1.getY());
            AffineTransform at = AffineTransform.getScaleInstance(width, -height);
            epath.transform(at);
            at = AffineTransform.getTranslateInstance(0, height);
            epath.transform(at);
            gfx.draw(epath);
            
            
//            gfx.setColor(new Color((int) (t.getSlope()), 255, (int) (255 - t.getSlope())));
//                gfx.fill(epath);
            //sklon
            if (slopeCalc != false){
            int slopecolor = (int)(t.sl);
            slopecolor = (int)(2.8*slopecolor);
            int colors = (int)t.getSlope();
            gfx.setColor(new Color(255-slopecolor,255-slopecolor,255-slopecolor));
            gfx.fill(epath);
            //System.out.println(t.getSlope());
           
            }
            
            //expozicia
//            int expcolor = (int)(255*(t.getExp()/(2*Math.PI)));
//            gfx.setColor(new Color(expcolor,expcolor,expcolor));
//            gfx.fill(epath);
            //ystem.out.println(t.getExp());
            double slope = Math.toDegrees(t.getSlope());
            //System.out.println(slope);
            
            if (expositionCalc != false){
            
                double exp = Math.toDegrees(t.getExp());
                //System.out.println(exp);
                if (exp>=347.5 || exp<22.5){
                    gfx.setColor(new Color(255,0,0));
                    gfx.fill(epath);
                }
                if (exp>=22.5 && exp<67.5){
                    gfx.setColor(new Color(255,0,180));
                    gfx.fill(epath);
                }
                if (exp>=67.5 && exp<112.5){
                    gfx.setColor(new Color(0,0,255));
                    gfx.fill(epath);
                }
                if (exp>=112.5 && exp<157.5){
                    gfx.setColor(new Color(255,127,80));
                    gfx.fill(epath);
                }
                if (exp>=157.5 && exp<202.5){
                    gfx.setColor(new Color(255,255,0));
                    gfx.fill(epath);
                }
                if (exp>=202.5 && exp<257.5){
                    gfx.setColor(new Color(152,251,152));
                    gfx.fill(epath);
                }
                if (exp>=257.5 && exp<302.5){
                    gfx.setColor(new Color(0,250,0));
                    gfx.fill(epath);
                }
                if (exp>=302.5 && exp<347.5){
                    gfx.setColor(new Color(0,150,250));
                    gfx.fill(epath);
                }
                
            }
            
        }
        
        for(Triangle t: triangles){
            int [] x,y;
            x = new int [3];
            y = new int [3];
            
            x[0] = (int)(t.p1.getX()*width);
            y[0] = (int)(t.p1.getY()*-height+height);
            x[1] = (int)(t.p2.getX()*width);
            y[1] = (int)(t.p2.getY()*-height+height);
            x[2] = (int)(t.p3.getX()*width);
            y[2] = (int)(t.p3.getY()*-height+height);
            
//            Polygon poly = new Polygon({x[0],x[1],x[2]},{y[0],y[1],y[2]},3);
//            gfx.fill(poly);
        }
        
        gfx.setColor(Color.RED);
        for (Edge e: edges){
            Path2D epath = new Path2D.Double();
            epath.moveTo(e.p1.getX(), e.p1.getY());
            epath.lineTo(e.p2.getX(), e.p2.getY());
            AffineTransform at = AffineTransform.getScaleInstance(width, -height);
            epath.transform(at);
            at = AffineTransform.getTranslateInstance(0, height);
            epath.transform(at);
            gfx.draw(epath);
        }
        
        
        gfx.setColor(Color.RED);
        AffineTransform at = AffineTransform.getScaleInstance(width, -height);
        triangulation.transform(at);
        at = AffineTransform.getTranslateInstance(0, height);
        triangulation.transform(at);
        gfx.draw(triangulation);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
