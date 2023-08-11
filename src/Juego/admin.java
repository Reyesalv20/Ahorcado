
package Juego;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class admin extends javax.swing.JFrame {


AdminPalabrasSecretas obj;
private ArrayList<String> array= obj.getPalabrasecretas();
String[] opciones = array.toArray(new String[0]);
    public admin(AdminPalabrasSecretas obj) {
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrar.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        borrar.setText("Borrar palabra");
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 212, -1));

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
        jPanel1.add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 212, -1));

        fija.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        fija.setText("Palabra fija");
        fija.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fijaMouseClicked(evt);
            }
        });
        jPanel1.add(fija, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 212, -1));

        menu.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        menu.setText("Regresar");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1016, 794, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imaganes/3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
//borrar palabra 

    
   String opcion =(String)JOptionPane.showInputDialog(null,"Selecciona la palabra que deseas borrar:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);


     











    }//GEN-LAST:event_borrarMouseClicked

    private void añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirMouseClicked

    private void fijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fijaMouseClicked
        // Palabra fija
        
 
   
    String opcion =(String)JOptionPane.showInputDialog(null,"Selecciona la palabra que deseas borrar:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
        
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
                new admin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadir;
    private javax.swing.JButton borrar;
    private javax.swing.JButton fija;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
