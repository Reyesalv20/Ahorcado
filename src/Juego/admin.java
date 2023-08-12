
package Juego;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class admin extends javax.swing.JFrame {

AdminPalabrasSecretas obj;

    public admin(AdminPalabrasSecretas obj) {
        initComponents();
        this.obj = obj;
        ArrayList<String> array = obj.getPalabrasecretas();
        String[] opciones = array.toArray(new String[0]);
        String mostrar = obj.toString();
        lista.setText(mostrar);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        borrar = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        fija = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JTextArea();
        ret = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrar.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        borrar.setText("Borrar palabra");
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 260, -1));

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
        jPanel1.add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 260, -1));

        fija.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        fija.setText("Palabra fija");
        fija.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fijaMouseClicked(evt);
            }
        });
        jPanel1.add(fija, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 260, -1));

        lista.setEditable(false);
        lista.setColumns(20);
        lista.setRows(5);
        jScrollPane1.setViewportView(lista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 220));

        ret.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        ret.setText("Regresar");
        ret.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retMouseClicked(evt);
            }
        });
        ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retActionPerformed(evt);
            }
        });
        jPanel1.add(ret, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 160, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
//borrar palabra 

    
  // String opcion =(String)JOptionPane.showInputDialog(null,"Selecciona la palabra que deseas borrar:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
    if(obj.getPalabrasecretas().isEmpty()){
        JOptionPane.showMessageDialog(null, "No hay nada datos");
        menu mn = new menu();
        mn.setVisible(true);
        this.setVisible(false); 
    }
    String indexB = JOptionPane.showInputDialog("Selecciona la palabra que deseas borrar:");
        try {
           int indice = Integer.parseInt(indexB+1);
           if (indice>=0 && indice<obj.getPalabrasecretas().size()) {
               String palabraBorrada = obj.getPalabrasecretas().remove(indice);
               JOptionPane.showMessageDialog(null, "Palabra *" +palabraBorrada+ "* ha sido borrada");
               lista.setText(obj.toString());
           } else {
               JOptionPane.showMessageDialog(null, "Indice no permitido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
           }
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Ingrese numero","ERROR",JOptionPane.ERROR);
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese numero","ERROR",JOptionPane.ERROR);
       }
 

    }//GEN-LAST:event_borrarMouseClicked

    private void añadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadirMouseClicked
        String nPalabra = JOptionPane.showInputDialog("Ingresa una nueva palabra:");
        if (nPalabra != null && !nPalabra.isEmpty() && nPalabra.length()>=2) {
            obj.agregarpalabras(nPalabra);
            JOptionPane.showMessageDialog(null, "Palabra añadida","Añadida",JOptionPane.INFORMATION_MESSAGE);
            lista.setText(obj.toString());
        }else{
            JOptionPane.showMessageDialog(null, "Añada una palabra valida","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_añadirMouseClicked

    private void fijaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fijaMouseClicked
        // Palabra fija
        
 
   
//    String opcion =(String)JOptionPane.showInputDialog(null,"Selecciona la palabra que deseas borrar:", "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
        
    }//GEN-LAST:event_fijaMouseClicked

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirActionPerformed

    private void retMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retMouseClicked
        menu mn = new menu();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retMouseClicked

    private void retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lista;
    private javax.swing.JButton ret;
    // End of variables declaration//GEN-END:variables
}
