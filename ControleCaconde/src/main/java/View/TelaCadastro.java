
package View;

/**
 *
 * @author Wesley
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bnt_cadastroPropriedadeTela = new javax.swing.JButton();
        bnt_cadastroProprietarioTela = new javax.swing.JButton();
        bnt_voltarPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(214, 240, 182));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("CADASTRO DE DADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel2)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        bnt_cadastroPropriedadeTela.setBackground(new java.awt.Color(214, 240, 182));
        bnt_cadastroPropriedadeTela.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        bnt_cadastroPropriedadeTela.setForeground(new java.awt.Color(75, 75, 75));
        bnt_cadastroPropriedadeTela.setText("CADASTRAR PROPRIEDADE");
        bnt_cadastroPropriedadeTela.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        bnt_cadastroPropriedadeTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_cadastroPropriedadeTelaActionPerformed(evt);
            }
        });

        bnt_cadastroProprietarioTela.setBackground(new java.awt.Color(214, 240, 182));
        bnt_cadastroProprietarioTela.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        bnt_cadastroProprietarioTela.setForeground(new java.awt.Color(75, 75, 75));
        bnt_cadastroProprietarioTela.setText("CADASTRAR PROPRIETÁRIO");
        bnt_cadastroProprietarioTela.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        bnt_cadastroProprietarioTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_cadastroProprietarioTelaActionPerformed(evt);
            }
        });

        bnt_voltarPrincipal.setBackground(new java.awt.Color(214, 240, 182));
        bnt_voltarPrincipal.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        bnt_voltarPrincipal.setForeground(new java.awt.Color(75, 75, 75));
        bnt_voltarPrincipal.setText("RETORNAR");
        bnt_voltarPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        bnt_voltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_voltarPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(bnt_voltarPrincipal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bnt_cadastroPropriedadeTela)
                            .addComponent(bnt_cadastroProprietarioTela))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(bnt_cadastroProprietarioTela)
                .addGap(111, 111, 111)
                .addComponent(bnt_cadastroPropriedadeTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(bnt_voltarPrincipal)
                .addContainerGap())
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

    private void bnt_cadastroPropriedadeTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_cadastroPropriedadeTelaActionPerformed
       TelaPropriedade telaPropriedade = new TelaPropriedade();
       telaPropriedade.setVisible(true);
       dispose();
    }//GEN-LAST:event_bnt_cadastroPropriedadeTelaActionPerformed

    private void bnt_cadastroProprietarioTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_cadastroProprietarioTelaActionPerformed
        TelaProprietario telaProprietario = new TelaProprietario();
        telaProprietario.setVisible(true);
        dispose();
    }//GEN-LAST:event_bnt_cadastroProprietarioTelaActionPerformed

    private void bnt_voltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_voltarPrincipalActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_bnt_voltarPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_cadastroPropriedadeTela;
    private javax.swing.JButton bnt_cadastroProprietarioTela;
    private javax.swing.JButton bnt_voltarPrincipal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}