/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delaunay;

import java.awt.Point;
import java.awt.geom.Point2D;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Random;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        benchmarkButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        zivField = new javax.swing.JTextField();
        contoursButton = new javax.swing.JButton();
        delaunayButton1 = new javax.swing.JButton();
        gridButton = new javax.swing.JButton();
        slopeButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout drawPanel1Layout = new javax.swing.GroupLayout(drawPanel1);
        drawPanel1.setLayout(drawPanel1Layout);
        drawPanel1Layout.setHorizontalGroup(
            drawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        drawPanel1Layout.setVerticalGroup(
            drawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pointsButton.setText("Points");
        pointsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsButtonActionPerformed(evt);
            }
        });

        pointCountField.setText("10");
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

        benchmarkButton.setText("Benchmark");
        benchmarkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benchmarkButtonActionPerformed(evt);
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

        gridButton.setText("Grid");
        gridButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridButtonActionPerformed(evt);
            }
        });

        slopeButton1.setText("Slope");
        slopeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slopeButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pointsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(pointCountField)
                    .addComponent(expositionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(benchmarkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zivField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(contoursButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delaunayButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gridButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slopeButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drawPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pointCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(pointsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(zivField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(delaunayButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contoursButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expositionButton)
                        .addGap(18, 18, 18)
                        .addComponent(gridButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slopeButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(benchmarkButton)
                        .addGap(210, 210, 210))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pointsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsButtonActionPerformed
        drawPanel1.expositionCalc = false;
        drawPanel1.slopeCalc = false;
        int npoints;
        npoints = Integer.parseInt(pointCountField.getText());
        
        drawPanel1.points = generateRandom3D(npoints);
        drawPanel1.repaint();  
        drawPanel1.triangles.clear();
        drawPanel1.edges.clear();
        
        
        
        
    }//GEN-LAST:event_pointsButtonActionPerformed

    private void expositionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expositionButtonActionPerformed
        drawPanel1.expositionCalc = true;
        drawPanel1.triangles = Algorithms.delaunay(drawPanel1.points);
        drawPanel1.repaint();
        System.out.println("---------");
        
    }//GEN-LAST:event_expositionButtonActionPerformed

    private void benchmarkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benchmarkButtonActionPerformed
         int npoints;
        npoints = Integer.parseInt(pointCountField.getText());
        
        while (true){
        drawPanel1.points = generateRandom3D(npoints);
        drawPanel1.triangles = Algorithms.delaunay(drawPanel1.points);

        drawPanel1.repaint();
        System.out.println("---------");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        
        }
    }//GEN-LAST:event_benchmarkButtonActionPerformed

    private void pointCountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointCountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointCountFieldActionPerformed

    private void contoursButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contoursButtonActionPerformed
        drawPanel1.edges = Algorithms.calcContours(drawPanel1.triangles, 0.001*Double.parseDouble(zivField.getText()));
        drawPanel1.repaint();
    }//GEN-LAST:event_contoursButtonActionPerformed

    private void delaunayButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delaunayButton1ActionPerformed
        drawPanel1.triangles = Algorithms.delaunay(drawPanel1.points);
        drawPanel1.repaint();
        System.out.println("---------");
    }//GEN-LAST:event_delaunayButton1ActionPerformed

    private void gridButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridButtonActionPerformed
        int npoints;
        npoints = Integer.parseInt(pointCountField.getText());
        
        drawPanel1.points2d = generateGrid(npoints);
        drawPanel1.repaint(); 
        
    }//GEN-LAST:event_gridButtonActionPerformed

    private void slopeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slopeButton1ActionPerformed
        drawPanel1.expositionCalc = false;
        drawPanel1.slopeCalc = true;
        for(Triangle t:drawPanel1.triangles){
            t.sl=Math.toDegrees(t.getSlope());
            
        }
        
        drawPanel1.repaint();
        System.out.println("---------");
    }//GEN-LAST:event_slopeButton1ActionPerformed

    private Point2D [] generateRandom(int size){
        Point2D [] points;
        points = new Point2D[size];
        Random rnd;
        rnd = new Random();
        for (int i=0;i<size;i++){
            
            points[i] = new Point2D.Double(rnd.nextDouble(),rnd.nextDouble());
        }
        return points;
    }
    private Point3D [] generateRandom3D(int size){
        Point3D [] points;
        points = new Point3D[size];
        Random rnd;
        rnd = new Random();
        for (int i=0;i<size;i++){
            
            points[i] = new Point3D(rnd.nextDouble(),rnd.nextDouble(),rnd.nextDouble()*0.2);
        }
        return points;
    }
    
    
    private Point2D[] generateCircle(int size){
        Point2D [] points;
        points = new Point2D[size];
        Random rnd;
        rnd = new Random();
        for (int i=0;i<size;i++){
            double rand = rnd.nextDouble()*2*Math.PI;
            double x = cos(rand)/2 + 0.5;
            double y = sin(rand)/2 + 0.5;
            points[i] = new Point2D.Double(x,y);
        }
        return points;
    }
    
//    private Point3D[] generateGrid(int size) {
//        Point3D[] grid;
//        grid = new Point3D[size];
//        
//        for (int x = 0; x < size; x++) {
//            
//            for (int y = 0; y < size; y++) {
//                
//                    grid[x * size + y] = new Point3D( x, y,0);
//                    
//                                       
//                     System.out.println(x);
//                }
//            
//
//        }
//        return grid;
//    }
    private Point2D[] generateGrid(int size) {
        Point2D[] grid;
        grid = new Point2D.Double[size * size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                // x* size + y -> místo [][] vlastně funguje jako odkaz na 
                // matici
                grid[x * size + y] = new Point2D.Double(1.0 / size * x, 1.0 / size * y);
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
    private javax.swing.JButton benchmarkButton;
    private javax.swing.JButton contoursButton;
    private javax.swing.JButton delaunayButton1;
    private Delaunay.drawPanel drawPanel1;
    private javax.swing.JButton expositionButton;
    private javax.swing.JButton gridButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pointCountField;
    private javax.swing.JButton pointsButton;
    private javax.swing.JButton slopeButton1;
    private javax.swing.JTextField zivField;
    // End of variables declaration//GEN-END:variables


}
