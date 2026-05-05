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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setBackground(new java.awt.Color(240, 195, 180));

        BtnRegresar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BtnRegresar.setText("Regresar");
        BtnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jLabel2.setText("Metodos de cadena");

        jLabel3.setText("Texto del Ususario: ");

        jLabel5.setText("1");

        jLabel6.setText("Texto del usuario en Minuscula: ");

        jLabel7.setText("2");

        jLabel8.setText("Longitud de la cadena: ");

        jLabel9.setText("3");

        jLabel10.setText("Cadena Invertida: ");

        jLabel11.setText("4");

        jLabel12.setText("Texto Extraido:");

        jLabel13.setText("5");

        javax.swing.GroupLayout RegresarLayout = new javax.swing.GroupLayout(Regresar);
        Regresar.setLayout(RegresarLayout);
        RegresarLayout.setHorizontalGroup(
            RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegresarLayout.createSequentialGroup()
                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(RegresarLayout.createSequentialGroup()
                                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RegresarLayout.createSequentialGroup()
                                        .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(249, 249, 249)
                                        .addComponent(jLabel4)))
                                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RegresarLayout.createSequentialGroup()
                                        .addGap(256, 256, 256)
                                        .addComponent(jLabel1))
                                    .addGroup(RegresarLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel13))))))
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel2))
                    .addGroup(RegresarLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(RegresarLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel12))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        RegresarLayout.setVerticalGroup(
            RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegresarLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel13)))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(180, 180, 180)
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed
        String cadena = campoTexto.getText();
        
        if (cadena == null || cadena.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, Ingrese una cadena de texto en Mayuscula");
            return; 
        }
        
        if (!cadena.matches("[A-Z ]+")) {
        JOptionPane.showMessageDialog(null, "Error: Solo se permiten letras en MAYÚSCULA.");
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
            String palabraInicial = JOptionPane.showInputDialog("Ingresa un numero entero"); 
            String palabraFinal = JOptionPane.showInputDialog("Ingresa un numero entero"); 
            
            int pi = Integer.parseInt(palabraInicial); 
            int pf = Integer.parseInt(palabraFinal); 
            
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
