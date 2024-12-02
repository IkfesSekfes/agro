
package View;

import DAO.PropriedadeDAO;
import DAO.ProprietarioDAO;
import Model.Propriedade;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley
 */
public class TelaPropriedade extends javax.swing.JFrame {

    /**
     * Creates new form TelaPropriedade
     */
    public TelaPropriedade() {
        initComponents();
    }
    //função para limpar campos de texto
    public void limparTela(){
        txt_propriedadeNome1.setText("");
        txt_propriedadeNome.setText("");
        txt_propriedadeNumero.setText("");
        txt_propriedadeRua.setText("");
        txt_propriedadeBairro.setText("");
    
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_propriedadeNome = new javax.swing.JTextField();
        txt_propriedadeBairro = new javax.swing.JTextField();
        txt_propriedadeNumero = new javax.swing.JTextField();
        txt_propriedadeRua = new javax.swing.JTextField();
        txt_propriedadeNome1 = new javax.swing.JTextField();
        btn_cadastrarPropriedade = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(214, 240, 182));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PROPRIEDADE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(75, 75, 75));
        jLabel8.setText("NOME:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(75, 75, 75));
        jLabel9.setText("PROPRIETÁRIO:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(75, 75, 75));
        jLabel10.setText("BAIRRO:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(75, 75, 75));
        jLabel11.setText("RUA: ");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(75, 75, 75));
        jLabel12.setText("NÚMERO:");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(75, 75, 75));
        jLabel14.setText("CADASTRO DA PROPRIEDADE");

        txt_propriedadeNome.setBackground(new java.awt.Color(187, 187, 187));
        txt_propriedadeNome.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_propriedadeNome.setForeground(new java.awt.Color(75, 75, 75));

        txt_propriedadeBairro.setBackground(new java.awt.Color(187, 187, 187));
        txt_propriedadeBairro.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_propriedadeBairro.setForeground(new java.awt.Color(75, 75, 75));

        txt_propriedadeNumero.setBackground(new java.awt.Color(187, 187, 187));
        txt_propriedadeNumero.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_propriedadeNumero.setForeground(new java.awt.Color(75, 75, 75));

        txt_propriedadeRua.setBackground(new java.awt.Color(187, 187, 187));
        txt_propriedadeRua.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_propriedadeRua.setForeground(new java.awt.Color(75, 75, 75));

        txt_propriedadeNome1.setBackground(new java.awt.Color(187, 187, 187));
        txt_propriedadeNome1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_propriedadeNome1.setForeground(new java.awt.Color(75, 75, 75));

        btn_cadastrarPropriedade.setBackground(new java.awt.Color(214, 240, 182));
        btn_cadastrarPropriedade.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_cadastrarPropriedade.setForeground(new java.awt.Color(75, 75, 75));
        btn_cadastrarPropriedade.setText("CADASTRAR");
        btn_cadastrarPropriedade.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        btn_cadastrarPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarPropriedadeActionPerformed(evt);
            }
        });

        btn_voltar.setBackground(new java.awt.Color(214, 240, 182));
        btn_voltar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(75, 75, 75));
        btn_voltar.setText("VOLTAR");
        btn_voltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_propriedadeNome1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_propriedadeRua, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel8))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(txt_propriedadeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_propriedadeBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_propriedadeNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(306, 306, 306)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_cadastrarPropriedade)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(btn_voltar)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel14)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_propriedadeNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_propriedadeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_propriedadeRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_propriedadeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_propriedadeNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btn_cadastrarPropriedade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btn_voltar))
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

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_cadastrarPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarPropriedadeActionPerformed
        //retronar mensagem quando usuário não preenche dados e tenta confirmar
        //verificado
        try {
            String nomeProprietario = txt_propriedadeNome1.getText();
            if(nomeProprietario == null || nomeProprietario.trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "O campo de nome proprietario não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
                
            }
            String nomePropriedade = txt_propriedadeNome.getText();
            if(nomePropriedade == null || nomePropriedade.trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "O campo de nome propriedade não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            String numeroPropriedade = txt_propriedadeNumero.getText();
            if(numeroPropriedade == null || numeroPropriedade.trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "O campo de numero não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            String ruaPropriedade = txt_propriedadeRua.getText();
            if(ruaPropriedade == null || numeroPropriedade.trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "O campo de rua não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            String bairroPropriedade = txt_propriedadeBairro.getText();
            if(bairroPropriedade == null || bairroPropriedade.trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "O campo de bairro não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
            //encontrar proprietario pelo nome vinculado a id
            ProprietarioDAO proprietarioDAO = new ProprietarioDAO();
                int proprietarioFK = proprietarioDAO.buscarProprietarioNome(nomeProprietario);
                //se proprietário não existir retorne
                if(proprietarioFK == -1){
                    JOptionPane.showMessageDialog(this, "Proprietário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
                }
            Propriedade propriedade = new Propriedade();
                propriedade.setNomePropriedade(nomePropriedade);
                propriedade.setNumeroPropriedade(numeroPropriedade);
                propriedade.setBairroPropriedade(bairroPropriedade);
                propriedade.setRuaPropriedade(ruaPropriedade);
                propriedade.setProprietarioFK(proprietarioFK);
            //cadastri do banco
            PropriedadeDAO propriedadeDAO = new PropriedadeDAO();
                if(propriedadeDAO.cadastrarPropriedade(propriedade, proprietarioFK)){
                JOptionPane.showMessageDialog(this, "Propriedade Cadastrada");
                //limpando campos de texto
                limparTela();
                }else{
                 JOptionPane.showMessageDialog(this, "Falha ao cadastrar: " ,"Erro:", JOptionPane.ERROR_MESSAGE);
            }
                    
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro no banco de dados: " + e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
                  e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cadastrarPropriedadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPropriedade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPropriedade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPropriedade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPropriedade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPropriedade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarPropriedade;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_propriedadeBairro;
    private javax.swing.JTextField txt_propriedadeNome;
    private javax.swing.JTextField txt_propriedadeNome1;
    private javax.swing.JTextField txt_propriedadeNumero;
    private javax.swing.JTextField txt_propriedadeRua;
    // End of variables declaration//GEN-END:variables
}
