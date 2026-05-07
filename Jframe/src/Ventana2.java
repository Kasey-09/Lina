import java.io.PrintStream;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
* @author Jose Avila C.I: 31.778.251
 */
public class Ventana2 extends javax.swing.JFrame {

    private JFrame ventanaPadre;
            
    public Ventana2(JFrame principal) {
        initComponents();
        setLocationRelativeTo(null);

        
        this.ventanaPadre = principal;     

        this.setResizable(false);
        this.ventanaPadre = principal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JPanel();
        BtnRegresar = new javax.swing.JButton();
        campoTexto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setBackground(new java.awt.Color(245, 245, 245));

        BtnRegresar.setBackground(new java.awt.Color(75, 163, 120));
        BtnRegresar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setText("Regresar");
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setBorderPainted(false);
        BtnRegresar.setContentAreaFilled(false);
        BtnRegresar.setOpaque(true);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        campoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Metodos de cadena");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Ingrese un texto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Texto del Ususario: ");

        jLabel5.setBackground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("  Resultado");
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Texto del usuario en Minuscula: ");

        jLabel7.setBackground(new java.awt.Color(245, 245, 245));
        jLabel7.setText("  Resultado");
        jLabel7.setOpaque(true);

        jLabel8.setText("Longitud de la cadena: ");

        jLabel9.setBackground(new java.awt.Color(245, 245, 245));
        jLabel9.setText("  Resultado");
        jLabel9.setOpaque(true);

        jLabel10.setText("Cadena Invertida: ");

        jLabel11.setBackground(new java.awt.Color(245, 245, 245));
        jLabel11.setText("   Resultado");
        jLabel11.setOpaque(true);

        jLabel12.setText("Texto Extraido:");

        jLabel13.setBackground(new java.awt.Color(245, 245, 245));
        jLabel13.setText("  Resultado");
        jLabel13.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        jLabel15.setBackground(new java.awt.Color(223, 243, 247));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("  Transformaciones");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel15.setOpaque(true);

        javax.swing.GroupLayout RegresarLayout = new javax.swing.GroupLayout(Regresar);
        Regresar.setLayout(RegresarLayout);
        RegresarLayout.setHorizontalGroup(
            RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegresarLayout.createSequentialGroup()
                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addGap(783, 783, 783)
                        .addComponent(jLabel4))
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RegresarLayout.createSequentialGroup()
                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegresarLayout.setVerticalGroup(
            RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed
        String cadena = campoTexto.getText();
        int pi, pf; 
        
        if (cadena == null || cadena.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, Ingrese una cadena de texto en Mayuscula");
            return; 
        }
        
        if (!cadena.matches("[A-Z ]+")) {
        JOptionPane.showMessageDialog(null, "Error: Solo se permiten palabras en MAYÚSCULA.");
        return;
        }
        
        if (cadena != cadena.toUpperCase()) {
            JOptionPane.showMessageDialog(null, "Error, Ingrese la cadena de texto en Mayuscula");
            return;
        }
        
        if (cadena != null && !cadena.isEmpty()) {
            // Imprimir en el label
            jLabel5.setText(cadena);
            System.out.println(cadena);
            System.out.println(((Object)cadena.getClass().getSimpleName()));

            // minuscula
            String minuscula = cadena.toLowerCase();
            jLabel7.setText(minuscula);

            // longitud de la cadena
            String textoSinespacio = cadena.trim(); 
            int longitud = textoSinespacio.length();
            jLabel9.setText(String.valueOf(longitud));

            // Invertir la cadena
            String invertir = new StringBuilder(cadena).reverse().toString(); 
            jLabel11.setText(invertir);
            
            // extraer una string
            String palabraInicial = JOptionPane.showInputDialog("Ingresa el primer numero entero. Para extraer una palabra"); 
            String palabraFinal = JOptionPane.showInputDialog("Ingresa el segundo numero entero. Para extraer una palabra");
            
            try {
                pi = Integer.parseInt(palabraInicial);
                pf = Integer.parseInt(palabraFinal);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Solo se aceptan números enteros.");
                return; 
            }
            
            if (pi >= 0 && pf <= cadena.length() && pi < pf) {
                String textoExtraido = cadena.substring(pi, pf); 
                jLabel13.setText(textoExtraido);
            }  
        } 
    }//GEN-LAST:event_campoTextoActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

        ventanaPadre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JPanel Regresar;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
