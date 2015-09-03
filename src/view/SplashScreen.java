/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
/**
 *
 * @author Fuady
 */
public class SplashScreen extends javax.swing.JDialog {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
        initComponents();
        setLocationRelativeTo(null);        
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }
    
    public JLabel getLabel(){
        return count;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JProgressBar();
        labelTunggu = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setModalExclusionType(null);
        setModalityType(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressBar.setForeground(new java.awt.Color(50, 81, 115));
        getContentPane().add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 380, 20));

        labelTunggu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTunggu.setForeground(new java.awt.Color(255, 255, 255));
        labelTunggu.setText("Mohon Tunggu....");
        getContentPane().add(labelTunggu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 120, -1));

        count.setForeground(new java.awt.Color(255, 255, 255));
        count.setText("jLabel2");
        getContentPane().add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/splash.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel count;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelTunggu;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}