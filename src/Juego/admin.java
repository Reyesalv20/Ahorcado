/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juego;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class admin extends javax.swing.JFrame {
ArrayList<String> definidas; 
String[] definidasArray = definidas.toArray(new String[0]);
AdminPalabrasSecretas objadm=new AdminPalabrasSecretas();
JuegoAhorcadoAzar objazar=new JuegoAhorcadoAzar(definidas);
int cont=0;

    public admin() {
        initComponents();
        
       
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        borrar = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        fija = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        borrar.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        borrar.setText("Borrar palabra");
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });

        añadir.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        añadir.setText("Añadir Palabra");
        añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadirMouseClicked(evt);
            }
        });
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        fija.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        fija.setText("Palabra fija");
        fija.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fijaMouseClicked(evt);
            }
        });

        menu.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        menu.setText("Regresar");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(añadir, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(fija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 232, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(borrar)
                .addGap(28, 28, 28)
                .addComponent(fija)
                .addGap(31, 31, 31)
                .addComponent(añadir)
                .addGap(109, 109, 109)
                .addComponent(menu)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
//borrar palabra 

    
   String opcion =(String)JOptionPane.showInputDialog(null,"Selecciona la palabra que deseas borrar:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,definidasArray,definidasArray[0]);














    }//GEN-LAST:event_borrarMouseClicked

    private void añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirMouseClicked

    private void fijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fijaMouseClicked
        // Palabra fija
        
 
   
    String opcion =(String)JOptionPane.showInputDialog(null,"Selecciona la palabra que deseas borrar:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,definidasArray,definidasArray[0]);
        
    }//GEN-LAST:event_fijaMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        menu mn = new menu();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuMouseClicked

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadir;
    private javax.swing.JButton borrar;
    private javax.swing.JButton fija;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
