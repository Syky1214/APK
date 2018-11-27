/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convexhull;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JFrame;

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
        
//        benchmarkText.setVisible(false);
//        radioJarvis.setVisible(false);
//        radioQuickHull.setVisible(false);
//        radioSweepLine.setVisible(false);
//        radioGrahamScan.setVisible(false);
//        benchmarkCombo.setVisible(false);
//        jLabel1.setVisible(false);
//        jLabel2.setVisible(false);
//        jLabel3.setVisible(false);
//        jLabel4.setVisible(false);
//        jLabel5.setVisible(false);
//        resultJarvis.setVisible(false);
//        resultQuickHull.setVisible(false);
//        resultSweepLine.setVisible(false);
//        resultGrahamScan.setVisible(false);
//        Calculate.setVisible(false);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Calculate = new javax.swing.JButton();
        radioGrahamScan = new javax.swing.JRadioButton();
        resultGrahamScan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resultSweepLine = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        resultQuickHull = new javax.swing.JTextField();
        resultJarvis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        benchmarkCombo = new javax.swing.JComboBox<>();
        radioSweepLine = new javax.swing.JRadioButton();
        radioQuickHull = new javax.swing.JRadioButton();
        radioJarvis = new javax.swing.JRadioButton();
        benchmarkText = new javax.swing.JTextField();
        qhButton = new javax.swing.JButton();
        pointCountField = new javax.swing.JTextField();
        jarvisButton1 = new javax.swing.JButton();
        sweepButton = new javax.swing.JButton();
        box = new javax.swing.JComboBox<>();
        Generate = new javax.swing.JButton();
        grahamScan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        drawPanel1 = new convexhull.drawPanel();
        Benchmark = new javax.swing.JButton();

        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFrame1.setMinimumSize(new java.awt.Dimension(160, 500));
        jFrame1.setPreferredSize(new java.awt.Dimension(160, 413));

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        radioGrahamScan.setText("GrahamScan");
        radioGrahamScan.setToolTipText("");

        resultGrahamScan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("GrahamScan");

        jLabel4.setText("SweepLine");

        resultSweepLine.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setText("QuickHull");

        resultQuickHull.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        resultJarvis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("Jarvis");

        jLabel1.setBackground(new java.awt.Color(24, 240, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Results");

        benchmarkCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Random", "Grid", "Circle" }));

        radioSweepLine.setText("SweepLine");
        radioSweepLine.setToolTipText("");

        radioQuickHull.setText("QuickHull");

        radioJarvis.setText("Jarvis");

        benchmarkText.setText("100");

        this.setVisible(false);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Calculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultGrahamScan)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultSweepLine)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultQuickHull)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultJarvis)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(benchmarkCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioGrahamScan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(radioSweepLine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioQuickHull, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioJarvis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(benchmarkText, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(benchmarkText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioJarvis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioQuickHull)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSweepLine, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioGrahamScan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(benchmarkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultJarvis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultQuickHull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultSweepLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultGrahamScan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calculate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        this.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        qhButton.setText("QuickHull");
        qhButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qhButtonActionPerformed(evt);
            }
        });

        pointCountField.setText("100");

        jarvisButton1.setText("Jarvis");
        jarvisButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jarvisButton1ActionPerformed(evt);
            }
        });

        sweepButton.setText("SweepLine");
        sweepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweepButtonActionPerformed(evt);
            }
        });

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Points", "Circle", "Ring", "Ellipse", "Square", "Heart", "Triangle", "Line Star", " " }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        Generate.setText("Generate");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });

        grahamScan.setText("GrahamScan");
        grahamScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grahamScanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Convex Hull Generator");

        drawPanel1.setBackground(new java.awt.Color(255, 255, 255));
        drawPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout drawPanel1Layout = new javax.swing.GroupLayout(drawPanel1);
        drawPanel1.setLayout(drawPanel1Layout);
        drawPanel1Layout.setHorizontalGroup(
            drawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        drawPanel1Layout.setVerticalGroup(
            drawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Benchmark.setText("Benchmark");
        Benchmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenchmarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qhButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sweepButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grahamScan, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jarvisButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pointCountField)
                    .addComponent(box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Benchmark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drawPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pointCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Generate)
                        .addGap(18, 18, 18)
                        .addComponent(jarvisButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qhButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sweepButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grahamScan)
                        .addGap(47, 47, 47)
                        .addComponent(Benchmark)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void benchmarktData(Point2D[] data) {
//        long startTime = System.nanoTime();
//        Algorithms.quickHull(data);
//        long endtime = System.nanoTime();
//        long quickTime = endtime - startTime;
//
//        startTime = System.nanoTime();
//        Algorithms.jarvisScan(data);
//        endtime = System.nanoTime();
//        long jarvisTime = endtime - startTime;
//
//        startTime = System.nanoTime();
//        Algorithms.sweepHull(data);
//        endtime = System.nanoTime();
//        long sweepTime = endtime - startTime;
//
//        //System.out.format("%d  %d %d\n",data.length,quickTime/1000,sweepTime/1000);
//        System.out.format("%d %d %d\n", data.length, quickTime / 1000, sweepTime / 1000);
//
//    }
    

    private Point2D[] generateCircle(int size) {
        Point2D[] points = new Point2D[size];
        Random rnd;
        rnd = new Random();
        for (int i = 0; i < size; i++) {
            double rand = rnd.nextDouble() * 2 * Math.PI;
            double x = Math.cos(rand) / 2 + 0.5;
            double y = Math.sin(rand) / 2 + 0.5;
            points[i] = new Point2D.Double(x, y);
        }

        return points;
    }
    
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

    private Point2D[] generateRandom(int size) {
        Point2D[] points = new Point2D[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            points[i] = new Point2D.Double(rnd.nextDouble(), rnd.nextDouble());
        }

        return points;
    }


    private void qhButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qhButtonActionPerformed
        drawPanel1.hull = Algorithms.quickHull(drawPanel1.points);
        drawPanel1.repaint();
    }//GEN-LAST:event_qhButtonActionPerformed

    private void jarvisButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jarvisButton1ActionPerformed
        drawPanel1.hull = Algorithms.jarvisScan(drawPanel1.points);
        drawPanel1.repaint();
    }//GEN-LAST:event_jarvisButton1ActionPerformed

    private void sweepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweepButtonActionPerformed
        drawPanel1.hull = Algorithms.sweepHull(drawPanel1.points);
        drawPanel1.repaint();
    }//GEN-LAST:event_sweepButtonActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        int item = box.getSelectedIndex();

        if (item == 0) {
            int npoints;
            npoints = Integer.parseInt(pointCountField.getText());
            Point2D[] points;
            points = new Point2D[npoints];
            Random rnd;
            rnd = new Random();
            for (int i = 0; i < npoints; i++) {

                points[i] = new Point2D.Double(rnd.nextDouble(), rnd.nextDouble());
            }

            drawPanel1.points = points;
            drawPanel1.repaint();
        } else if (item == 1) {
            int npoints;
            npoints = Integer.parseInt(pointCountField.getText());
            Point2D[] points;
            points = new Point2D[npoints];
            Random rnd;
            rnd = new Random();

            for (int i = 0; i < npoints; i++) {
                double t = rnd.nextDouble() * Math.PI * 2;
                points[i] = new Point2D.Double(0.5 + (Math.cos(t) * rnd.nextDouble()) * 0.4, 0.5 + (Math.sin(t) * rnd.nextDouble()) * 0.4);
            }

            drawPanel1.points = points;
            drawPanel1.repaint();

        } else if (item == 2) {
            int npoints;
            npoints = Integer.parseInt(pointCountField.getText());
            Point2D[] points;
            points = new Point2D[npoints];
            Random rnd;

            rnd = new Random();

            for (int i = 0; i < npoints; i++) {
                double ran = rnd.nextDouble();

                double t = ran * Math.PI * 2;
                points[i] = new Point2D.Double(0.5 + (Math.cos(t * ran)) * 0.4, 0.5 + (Math.sin(t * ran)) * 0.4);
            }

            drawPanel1.points = points;
            drawPanel1.repaint();
        } else if (item == 3) {

            int npoints;
            npoints = Integer.parseInt(pointCountField.getText());
            Point2D[] points;
            points = new Point2D[npoints];
            Random rnd;
            rnd = new Random();

            for (int i = 0; i < npoints; i++) {
                double t = rnd.nextDouble() * Math.PI * 2;
                points[i] = new Point2D.Double(0.5 + (Math.cos(t) * rnd.nextDouble()) * 0.5, 0.5 + (Math.sin(t) * rnd.nextDouble()) * 0.3);
            }

            drawPanel1.points = points;
            drawPanel1.repaint();

        } else if (item == 4) {
            int npoints;
            npoints = Integer.parseInt(pointCountField.getText());
            Point2D[] points;
            points = new Point2D[npoints];
            Random rnd;

            rnd = new Random();

            for (int i = 0; i < npoints; i++) {

                points[i] = new Point2D.Double((0.5 + drawPanel.WIDTH / 4) + rnd.nextDouble() / 4, (0.5 + drawPanel.HEIGHT / 4) + rnd.nextDouble() / 4);
                i++;
                points[i] = new Point2D.Double((0.5 + drawPanel.WIDTH / 4) - rnd.nextDouble() / 4, (0.5 + drawPanel.HEIGHT / 4) + rnd.nextDouble() / 4);
                i++;
                points[i] = new Point2D.Double((0.5 + drawPanel.WIDTH / 4) + rnd.nextDouble() / 4, (0.5 + drawPanel.HEIGHT / 4) - rnd.nextDouble() / 4);
                i++;
                points[i] = new Point2D.Double((0.5 + drawPanel.WIDTH / 4) - rnd.nextDouble() / 4, (0.5 + drawPanel.HEIGHT / 4) - rnd.nextDouble() / 4);

            }

            drawPanel1.points = points;
            drawPanel1.repaint();
        } else if (item == 5) {
            int npoints;
            npoints = Integer.parseInt(pointCountField.getText());
            Point2D[] points;
            points = new Point2D[npoints];
            Random rnd;

            rnd = new Random();

            for (int i = 0; i < npoints; i++) {
                double t = rnd.nextDouble() * Math.PI * 2;
                double ran = rnd.nextDouble();

                double x = Math.cos(t) * Math.pow(Math.abs(Math.tan(t)), Math.abs(1 / Math.tan(t))) * ran;
                double y = Math.abs(Math.sin(t) * Math.pow(Math.abs(Math.tan(t)), Math.abs(1 / Math.tan(t)))) * ran;

                points[i] = new Point2D.Double(0.5 + x * 0.4, 0.3 + y * 0.4);
            }

            drawPanel1.points = points;
            drawPanel1.repaint();

        } else if (item == 6) {
            int npoints;
            npoints = Integer.parseInt(pointCountField.getText());
            Point2D[] points;
            points = new Point2D[npoints];
            Random rnd;

            rnd = new Random();
            double ax = rnd.nextDouble();
            double ay = rnd.nextDouble();
            double bx = rnd.nextDouble();
            double by = rnd.nextDouble();
            double cx = rnd.nextDouble();
            double cy = rnd.nextDouble();
            for (int i = 0; i < npoints; i++) {
                double ran1 = rnd.nextDouble();
                double ran2 = rnd.nextDouble();

                double x = (1 - Math.sqrt(ran1)) * ax + (Math.sqrt(ran1) * (1 - ran2)) * bx + (ran2 * Math.sqrt(ran1)) * cx;
                double y = (1 - Math.sqrt(ran1)) * ay + (Math.sqrt(ran1) * (1 - ran2)) * by + (ran2 * Math.sqrt(ran1)) * cy;

                points[i] = new Point2D.Double(x, y);
            }

            drawPanel1.points = points;
            drawPanel1.repaint();
        } else if (item == 7) {
            int npoints;
            npoints = Integer.parseInt(pointCountField.getText());
            Point2D[] points;
            points = new Point2D[npoints];
            Random rnd;

            rnd = new Random();
            double degrees144 = Math.toRadians(144);
            double angle = 0;

            for (int i = 0; i < npoints; i++) {
                double ran1 = rnd.nextDouble();

                double x = Math.cos(angle) * 0.5 * ran1;
                double y = Math.sin(angle) * 0.5 * ran1;

                angle -= degrees144;

                points[i] = new Point2D.Double(0.5 + x, 0.5 + y);
            }

            drawPanel1.points = points;
            drawPanel1.repaint();
        }

    }//GEN-LAST:event_GenerateActionPerformed

    private void grahamScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grahamScanActionPerformed
        drawPanel1.hull = Algorithms.grahamScan(drawPanel1.points);
        drawPanel1.repaint();
    }//GEN-LAST:event_grahamScanActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        int item = benchmarkCombo.getSelectedIndex();
        int points = Integer.parseInt(benchmarkText.getText());
        int gridP = (int)Math.sqrt(points);
        Point2D [] grid;
        if (radioJarvis.isSelected()){            
            switch (item){
                case 0: grid = generateRandom(points);
                        benchmarktDataJarvis(grid);
                        break;
                case 1: grid = generateGrid(gridP);
                        benchmarktDataJarvis(grid);
                        break;
                case 2: grid = generateCircle(points);
                        benchmarktDataJarvis(grid);
                        break;
                
            }
        }else{
            resultJarvis.setText("");
        }
        if (radioQuickHull.isSelected()){            
            switch (item){
                case 0: grid = generateRandom(points);
                        benchmarktDataQuickHull(grid);
                        break;
                case 1: grid = generateGrid(gridP);
                        benchmarktDataQuickHull(grid);
                        break;
                case 2: grid = generateCircle(points);
                        benchmarktDataQuickHull(grid);
                        break;
              
            }
        }else{
            resultQuickHull.setText("");
        }
        if (radioSweepLine.isSelected()){            
            switch (item){
                case 0: grid = generateRandom(points);
                        benchmarktDataSweepLine(grid);
                        break;
                case 1: grid = generateGrid(gridP);
                        benchmarktDataSweepLine(grid);
                        break;
                case 2: grid = generateCircle(points);
                        benchmarktDataSweepLine(grid);
                        break;
                
            }
        }else{
            resultSweepLine.setText("");
        }
        if (radioGrahamScan.isSelected()){            
            switch (item){
                case 0: grid = generateRandom(points);
                        benchmarktDataGrahamScan(grid);
                        break;
                case 1: grid = generateGrid(points);
                        benchmarktDataGrahamScan(grid);
                        break;
                case 2: grid = generateCircle(points);
                        benchmarktDataGrahamScan(grid);
                        break;
                
            }
        }else{
            resultGrahamScan.setText("");
        }
    }//GEN-LAST:event_CalculateActionPerformed

    private void BenchmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenchmarkActionPerformed
        jFrame1.setVisible(true);
    }//GEN-LAST:event_BenchmarkActionPerformed

    private void benchmarktDataJarvis(Point2D[] data) {
        long startTime = System.nanoTime();
        Algorithms.jarvisScan(data);
        long endtime = System.nanoTime();
        long jarvisTime = endtime - startTime;
        if (jarvisTime > 1000000 ){
            resultJarvis.setText(String.valueOf(jarvisTime/1000000+" ms"));
        }else{
            resultJarvis.setText(String.valueOf(jarvisTime/1000+" μs"));
        }              
    }
     private void benchmarktDataQuickHull(Point2D[] data) {
        long startTime = System.nanoTime();
        Algorithms.quickHull(data);
        long endtime = System.nanoTime();
        long quickTime = endtime - startTime;        
        resultQuickHull.setText(String.valueOf(quickTime/1000+" μs"));
        
     }
    private void benchmarktDataSweepLine(Point2D[] data) {
        long startTime = System.nanoTime();
        Algorithms.sweepHull(data);
        long endtime = System.nanoTime();
        long sweepTime = endtime - startTime;        
        resultSweepLine.setText(String.valueOf(sweepTime/1000+" μs"));        
    }
    private void benchmarktDataGrahamScan(Point2D[] data) {
        long startTime = System.nanoTime();
        Algorithms.grahamScan(data);
        long endtime = System.nanoTime();
        long grahamTime = endtime - startTime;                
        resultGrahamScan.setText(String.valueOf(grahamTime/1000+" μs"));       
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
    private javax.swing.JButton Benchmark;
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Generate;
    private javax.swing.JComboBox<String> benchmarkCombo;
    private javax.swing.JTextField benchmarkText;
    private javax.swing.JComboBox<String> box;
    private convexhull.drawPanel drawPanel1;
    private javax.swing.JButton grahamScan;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jarvisButton1;
    private javax.swing.JTextField pointCountField;
    private javax.swing.JButton qhButton;
    private javax.swing.JRadioButton radioGrahamScan;
    private javax.swing.JRadioButton radioJarvis;
    private javax.swing.JRadioButton radioQuickHull;
    private javax.swing.JRadioButton radioSweepLine;
    private javax.swing.JTextField resultGrahamScan;
    private javax.swing.JTextField resultJarvis;
    private javax.swing.JTextField resultQuickHull;
    private javax.swing.JTextField resultSweepLine;
    private javax.swing.JButton sweepButton;
    // End of variables declaration//GEN-END:variables
}
