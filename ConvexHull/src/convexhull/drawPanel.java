/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convexhull;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Marek a Matus
 */
public class drawPanel extends javax.swing.JPanel {

    //variable
    Point2D[] points;
    Path2D hull;

    /**
     * Creates new form drawPanel
     */
    public drawPanel() {
        points = new Point2D[0];
        hull = new Path2D.Double();
        initComponents();
    }

    //drawing method
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gfx = (Graphics2D) g;

        int width;
        int height;

        width = this.getWidth();
        height = this.getHeight();

        gfx.setColor(Color.BLACK);

        //draw points
        for (int i = 0; i < points.length; i++) {
            int x;
            int y;
            x = (int) (points[i].getX() * width);
            y = (int) ((1 - points[i].getY()) * height);

            //points in cross shape
            gfx.drawLine(x - 5, y - 5, x + 5, y + 5);
            gfx.drawLine(x - 5, y + 5, x + 5, y - 5);

        }
        
        //draw convex hull
        gfx.setColor(Color.RED);
        AffineTransform at = AffineTransform.getScaleInstance(width, -height);
        hull.transform(at);
        at = AffineTransform.getTranslateInstance(0, height);
        hull.transform(at);
        gfx.draw(hull);
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
