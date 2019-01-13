/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delaunay;

import java.awt.Point;
import java.awt.geom.Point2D;
import static java.lang.Math.cos;
import static java.lang.Math.random;
import static java.lang.Math.sin;
import static java.lang.StrictMath.random;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 *
 * @author jethro
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawPanel1 = new Delaunay.drawPanel();
        pointsButton = new javax.swing.JButton();
        pointCountField = new javax.swing.JTextField();
        expositionButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        zivField = new javax.swing.JTextField();
        contoursButton = new javax.swing.JButton();
        delaunayButton1 = new javax.swing.JButton();
        slopeButton1 = new javax.swing.JButton();
        hypsometry = new javax.swing.JButton();
        valleyButton1 = new javax.swing.JButton();
        hillButton = new javax.swing.JButton();
        ridgeButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout drawPanel1Layout = new javax.swing.GroupLayout(drawPanel1);
        drawPanel1.setLayout(drawPanel1Layout);
        drawPanel1Layout.setHorizontalGroup(
            drawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );
        drawPanel1Layout.setVerticalGroup(
            drawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        pointsButton.setText("Points");
        pointsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsButtonActionPerformed(evt);
            }
        });

        pointCountField.setText("8");
        pointCountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointCountFieldActionPerformed(evt);
            }
        });

        expositionButton.setText("Exposition");
        expositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expositionButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("ZIV = ");

        zivField.setText("10");

        contoursButton.setText("Contours");
        contoursButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contoursButtonActionPerformed(evt);
            }
        });

        delaunayButton1.setText("Delaunay");
        delaunayButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delaunayButton1ActionPerformed(evt);
            }
        });

        slopeButton1.setText("Slope");
        slopeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slopeButton1ActionPerformed(evt);
            }
        });

        hypsometry.setText("hypsometry");
        hypsometry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypsometryActionPerformed(evt);
            }
        });

        valleyButton1.setText("Valley");
        valleyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valleyButton1ActionPerformed(evt);
            }
        });

        hillButton.setText("Hill");
        hillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hillButtonActionPerformed(evt);
            }
        });

        ridgeButton1.setText("Ridge");
        ridgeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridgeButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zivField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pointsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(hypsometry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slopeButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expositionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contoursButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delaunayButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valleyButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ridgeButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hillButton, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(pointCountField))
                .addGap(35, 35, 35)
                .addComponent(drawPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pointCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(pointsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ridgeButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hillButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valleyButton1)
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(zivField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(delaunayButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contoursButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expositionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slopeButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hypsometry)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pointsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsButtonActionPerformed
        drawPanel1.expositionCalc = false;
        drawPanel1.slopeCalc = false;
        drawPanel1.hypsCalc = false;
        int npoints;
        npoints = Integer.parseInt(pointCountField.getText());

        drawPanel1.points = generateRandom3D(npoints);
        drawPanel1.repaint();
        drawPanel1.triangles.clear();
        drawPanel1.edges.clear();


    }//GEN-LAST:event_pointsButtonActionPerformed

    private void expositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expositionButtonActionPerformed
        drawPanel1.expositionCalc = true;
        drawPanel1.hypsCalc = false;
        drawPanel1.slopeCalc = false;
        drawPanel1.triangles = Algorithms.delaunay(drawPanel1.points);
        drawPanel1.repaint();
        System.out.println("---------");

    }//GEN-LAST:event_expositionButtonActionPerformed

    private void pointCountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointCountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointCountFieldActionPerformed

    private void contoursButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contoursButtonActionPerformed
        drawPanel1.edges = Algorithms.calcContours(drawPanel1.triangles, 0.001 * Double.parseDouble(zivField.getText()));
        drawPanel1.repaint();
    }//GEN-LAST:event_contoursButtonActionPerformed

    private void delaunayButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delaunayButton1ActionPerformed
        drawPanel1.expositionCalc = false;
        drawPanel1.slopeCalc = false;
        drawPanel1.hypsCalc = false;
        drawPanel1.triangles = Algorithms.delaunay(drawPanel1.points);
        drawPanel1.repaint();
        System.out.println("---------");
    }//GEN-LAST:event_delaunayButton1ActionPerformed

    private void hillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hillButtonActionPerformed
        drawPanel1.expositionCalc = false;
        drawPanel1.slopeCalc = false;
        drawPanel1.hypsCalc = false;
        int npoints;
        npoints = Integer.parseInt(pointCountField.getText());
        Point3D[] points;
        points = new Point3D[npoints];
        Random rnd;
        rnd = new Random();
        System.out.println(Math.PI);
        for (int i = 0; i < npoints; i++) {

            double z = rnd.nextDouble();
            double t = rnd.nextDouble() * Math.PI * 2;
            double vyska = z * 0.2;
            points[i] = new Point3D(0.5 + (Math.cos(t) * (1 - z)) * 0.4, 0.5 + (Math.sin(t) * (1 - z)) * 0.4, vyska);
            System.out.println(vyska);

        }

        drawPanel1.points = points;
        drawPanel1.repaint();
        drawPanel1.triangles.clear();
        drawPanel1.edges.clear();

    }//GEN-LAST:event_hillButtonActionPerformed

    private void slopeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slopeButton1ActionPerformed
        drawPanel1.hypsCalc = false;
        drawPanel1.expositionCalc = false;
        drawPanel1.slopeCalc = true;
        for (Triangle t : drawPanel1.triangles) {
            t.sl = Math.toDegrees(t.getSlope());

        }

        drawPanel1.repaint();
        System.out.println("---------");
    }//GEN-LAST:event_slopeButton1ActionPerformed

    private void valleyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valleyButton1ActionPerformed
        drawPanel1.expositionCalc = false;
        drawPanel1.slopeCalc = false;
        drawPanel1.hypsCalc = false;
        int npoints;
        npoints = Integer.parseInt(pointCountField.getText());
        Point3D[] points;
        points = new Point3D[npoints];
        Random rnd;
        rnd = new Random();

        for (int i = 0; i < npoints; i++) {

            double z = rnd.nextDouble();

            System.out.println(z);
            double t = rnd.nextDouble() * Math.PI * 2;

            double vyska = z * 0.2;
            points[i] = new Point3D(0.5 + (Math.cos(t) * (z)) * 0.4, 0.5 + (Math.sin(t) * (z)) * 0.4, vyska);
            System.out.println(vyska);

        }

        drawPanel1.points = points;
        drawPanel1.repaint();
        drawPanel1.triangles.clear();
        drawPanel1.edges.clear();
    }//GEN-LAST:event_valleyButton1ActionPerformed

    private void ridgeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridgeButton1ActionPerformed
        drawPanel1.expositionCalc = false;
        drawPanel1.slopeCalc = false;
        drawPanel1.hypsCalc = false;
        int npoints;
        npoints = Integer.parseInt(pointCountField.getText());

        drawPanel1.points = generateRidge(npoints);
        drawPanel1.repaint();
        drawPanel1.triangles.clear();
        drawPanel1.edges.clear();
    }//GEN-LAST:event_ridgeButton1ActionPerformed

    private void hypsometryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypsometryActionPerformed
        drawPanel1.hypsCalc = true;
        drawPanel1.slopeCalc = false;
        drawPanel1.expositionCalc = false;
        for (Triangle t : drawPanel1.triangles) {
            double p1 = t.p1.getZ();
            double p2 = t.p1.getZ();
            double p3 = t.p1.getZ();
//          nejnizsi bod
//            if (p1 < p2){
//                t.alt = p1;
//            }else{
//                t.alt = p2;
//            }
//            if (p3 < t.alt){
//                t.alt = p3;
//            }

//          prumerna vyska
            t.alt = (p1 + p2 + p3) / 3;
            System.out.println(t.alt);

        }
        drawPanel1.repaint();
    }//GEN-LAST:event_hypsometryActionPerformed

    private Point2D[] generateRandom(int size) {
        Point2D[] points;
        points = new Point2D[size];
        Random rnd;
        rnd = new Random();
        for (int i = 0; i < size; i++) {

            points[i] = new Point2D.Double(rnd.nextDouble(), rnd.nextDouble());
        }
        return points;
    }

    private Point3D[] generateRandom3D(int size) {
        Point3D[] points;
        points = new Point3D[size];
        Random rnd;
        rnd = new Random();
        for (int i = 0; i < size; i++) {

            points[i] = new Point3D(rnd.nextDouble(), rnd.nextDouble(), rnd.nextDouble() * 0.2);
        }
        return points;
    }

    private Point2D[] generateCircle(int size) {
        Point2D[] points;
        points = new Point2D[size];
        Random rnd;
        rnd = new Random();
        for (int i = 0; i < size; i++) {
            double rand = rnd.nextDouble() * 2 * Math.PI;
            double x = cos(rand) / 2 + 0.5;
            double y = sin(rand) / 2 + 0.5;
            points[i] = new Point2D.Double(x, y);
        }
        return points;
    }

    private Point3D[] generateRidge(int size) {
        Point3D[] grid;
        grid = new Point3D[size * size];
        double z = 0;
        Random rnd;
        rnd = new Random();
        double max = 0.1;
        double min = -0.1;
        double vyska;

        for (int x = 0; x < size; x++) {
            if (x < size / 2) {
                z++;
            }
            if (x >= size / 2) {
                z--;
            }
            for (int y = 0; y < size; y++) {

                vyska = z + (rnd.nextDouble() * (max - min));
                grid[x * size + y] = new Point3D(1.0 / size * x, 1.0 / size * y, vyska * 0.2);
                System.out.println(vyska);
            }
        }
        return grid;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contoursButton;
    private javax.swing.JButton delaunayButton1;
    private Delaunay.drawPanel drawPanel1;
    private javax.swing.JButton expositionButton;
    private javax.swing.JButton hillButton;
    private javax.swing.JButton hypsometry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pointCountField;
    private javax.swing.JButton pointsButton;
    private javax.swing.JButton ridgeButton1;
    private javax.swing.JButton slopeButton1;
    private javax.swing.JButton valleyButton1;
    private javax.swing.JTextField zivField;
    // End of variables declaration//GEN-END:variables

}
