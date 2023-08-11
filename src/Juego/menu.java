/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juego;

import Juego.fijo;
import Juego.azar;
import java.util.ArrayList;


public class menu extends javax.swing.JFrame {
    ArrayList<String> todas;  

    public menu() {
        initComponents();
        todas= new ArrayList<>();
        todas.add("MAÑANA");
        todas.add("PARAGUAY");
        todas.add("VAMONOS");
        todas.add("PANTALLA");
        todas.add("PIZZA");
        todas.add("ESTOCOLMO");
        todas.add("GITHUB");
        todas.add("PANTALLA");
        JuegoAhorcadoAzar ja=new JuegoAhorcadoAzar(todas);
        System.out.println(todas);
    }                               


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        azar = new javax.swing.JButton();
        fijo = new javax.swing.JButton();
        admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        azar.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        azar.setText("Jugar Modo Azar");
        azar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                azarMouseClicked(evt);
            }
        });

        fijo.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        fijo.setText("Jugar Modo Fijo");
        fijo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fijoMouseClicked(evt);
            }
        });

        admin.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        admin.setText("Administrar");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(azar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fijo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(241, 241, 241))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(admin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(azar)
                .addGap(36, 36, 36)
                .addComponent(fijo)
                .addGap(33, 33, 33)
                .addComponent(admin)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void azarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_azarMouseClicked
                                         
        JuegoAhorcadoAzar ah =new JuegoAhorcadoAzar(todas);
        azar az =new azar(ah);
        az.setVisible(true);
        this.setVisible(false);                               
    }//GEN-LAST:event_azarMouseClicked

    private void fijoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fijoMouseClicked
        String palabra = "VACIO";
        JuegoAhorcadoFijo ah =new JuegoAhorcadoFijo(palabra);
        fijo f=new fijo(ah);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fijoMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
       AdminPalabrasSecretas as=new AdminPalabrasSecretas(todas);
        admin ad = new admin(as);
    }//GEN-LAST:event_adminMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton azar;
    private javax.swing.JButton fijo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
