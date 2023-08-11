/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Juego;

import javax.swing.JOptionPane;

import java.util.ArrayList;
public class azar extends javax.swing.JFrame {

    JuegoAhorcadoAzar juego;

    public azar(JuegoAhorcadoAzar juego) {
        this.juego = juego;
        initComponents();
        juego.inicializarPalabraSecreta();
        System.out.println(juego.palabraSecreta);
        palabraActualInput.setText(juego.palabraActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        confirmar_letra = new javax.swing.JButton();
        oportunidades = new javax.swing.JLabel();
        letraIngresar = new javax.swing.JTextField();
        palabraActualInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        confirmar_letra.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        confirmar_letra.setText("Ingresar Letra");
        confirmar_letra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmar_letraMouseClicked(evt);
            }
        });
        jPanel1.add(confirmar_letra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));
        jPanel1.add(oportunidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 170, 204));

        letraIngresar.setBackground(new java.awt.Color(102, 102, 0));
        letraIngresar.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        letraIngresar.setForeground(new java.awt.Color(255, 255, 255));
        letraIngresar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(letraIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 87, 47));

        palabraActualInput.setEditable(false);
        palabraActualInput.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jPanel1.add(palabraActualInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 191, 43));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/Imaganes/2 2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmar_letraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmar_letraMouseClicked
        String letra = letraIngresar.getText().toUpperCase();
        if (letra.length() > 1) {
            JOptionPane.showMessageDialog(null, "Solo ingrese UNA letra", "AHORCADO AZAR", JOptionPane.WARNING_MESSAGE);
        } else if (letra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una letra", "AHORCADO AZAR", JOptionPane.WARNING_MESSAGE);
        } else {
            letraIngresar.setText("");
            char letraIngresada = letra.charAt(0);
            
            // Verificar si se tiene que quitarle un turno o no
            if (!juego.verificarLetra(letraIngresada)) {
                juego.intentosRestantes--;
                
                if (juego.intentosRestantes == 0) {
                JOptionPane.showMessageDialog(null, "Te has quedado sin turnos.\nLa palabra a adivinar era: " + juego.palabraSecreta);
                dispose();
                return;
                }
            }
            
            
            System.out.println("PALABRA ACTUAL: " + juego.palabraActual);
            juego.actualizarPalabraActual(letraIngresada);
            System.out.println("NEW: " + juego.palabraActual);
            palabraActualInput.setText(juego.palabraActual);
        }
        
        if (juego.hasGanado()) {
            JOptionPane.showMessageDialog(null, "HAS GANADO!");
            dispose();
            return;
        }
                
    }//GEN-LAST:event_confirmar_letraMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        menu mn = new menu();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(azar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(azar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(azar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(azar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList<String> palabras = new ArrayList();
                palabras.add("HOLA");
                palabras.add("ADIOS");
                JuegoAhorcadoAzar juego = new JuegoAhorcadoAzar(palabras);
                new azar(juego).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar_letra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField letraIngresar;
    private javax.swing.JLabel oportunidades;
    private javax.swing.JTextField palabraActualInput;
    // End of variables declaration//GEN-END:variables
}
