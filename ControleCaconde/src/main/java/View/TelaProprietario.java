package View;

import DAO.ProprietarioDAO;
import Model.Proprietario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley
 */
public class TelaProprietario extends javax.swing.JFrame {

    /**
     * Creates new form TelaProprietario
     */
    public TelaProprietario() {
        initComponents();
    } 
    //função para limpar entrada de dados
    public void limpar(){
        txt_proprietarioNome.setText("");
        txt_proprietarioCPF.setText("");
        txt_proprietarioMatricula.setText("");
        txt_proprietarioCAR.setText("");
        txt_proprietarioCCIR.setText("");
        txt_proprietarioNIRF.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_cadastroProprietario = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_proprietarioNome = new javax.swing.JTextField();
        txt_proprietarioMatricula = new javax.swing.JTextField();
        txt_proprietarioCCIR = new javax.swing.JTextField();
        txt_proprietarioNIRF = new javax.swing.JTextField();
        txt_proprietarioCAR = new javax.swing.JTextField();
        txt_proprietarioCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(214, 240, 182));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PROPRIETÁRIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel2)
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(35, 35, 35))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 75, 75));
        jLabel1.setText("CPF:");

        btn_cadastroProprietario.setBackground(new java.awt.Color(214, 240, 182));
        btn_cadastroProprietario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_cadastroProprietario.setForeground(new java.awt.Color(75, 75, 75));
        btn_cadastroProprietario.setText("CADASTRAR");
        btn_cadastroProprietario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        btn_cadastroProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastroProprietarioActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(75, 75, 75));
        jLabel8.setText("NOME:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(75, 75, 75));
        jLabel9.setText("MATRÍCULA:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(75, 75, 75));
        jLabel10.setText("CCIR:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(75, 75, 75));
        jLabel11.setText("NIRF:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(75, 75, 75));
        jLabel12.setText("CAR:");

        txt_proprietarioNome.setBackground(new java.awt.Color(187, 187, 187));
        txt_proprietarioNome.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_proprietarioNome.setForeground(new java.awt.Color(75, 75, 75));

        txt_proprietarioMatricula.setBackground(new java.awt.Color(187, 187, 187));
        txt_proprietarioMatricula.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_proprietarioMatricula.setForeground(new java.awt.Color(75, 75, 75));

        txt_proprietarioCCIR.setBackground(new java.awt.Color(187, 187, 187));
        txt_proprietarioCCIR.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_proprietarioCCIR.setForeground(new java.awt.Color(75, 75, 75));

        txt_proprietarioNIRF.setBackground(new java.awt.Color(187, 187, 187));
        txt_proprietarioNIRF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_proprietarioNIRF.setForeground(new java.awt.Color(75, 75, 75));

        txt_proprietarioCAR.setBackground(new java.awt.Color(187, 187, 187));
        txt_proprietarioCAR.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txt_proprietarioCAR.setForeground(new java.awt.Color(75, 75, 75));

        txt_proprietarioCPF.setBackground(new java.awt.Color(187, 187, 187));
        txt_proprietarioCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        txt_proprietarioCPF.setForeground(new java.awt.Color(75, 75, 75));
        try {
            txt_proprietarioCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_proprietarioCPF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cadastroProprietario)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_voltar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(79, 79, 79))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(25, 25, 25)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(85, 85, 85)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_proprietarioNIRF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(txt_proprietarioCCIR, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(txt_proprietarioMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(txt_proprietarioNome, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(txt_proprietarioCAR, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(txt_proprietarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_proprietarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_proprietarioCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_proprietarioMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_proprietarioCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_proprietarioCCIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_proprietarioNIRF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btn_cadastroProprietario)
                .addGap(24, 24, 24)
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

    private void btn_cadastroProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastroProprietarioActionPerformed
        //verificado
        try {
            //verificando se campo está vazio e passando valor do jtext para atributo
                String nomeProprietario = txt_proprietarioNome.getText();
                    if(nomeProprietario == null || nomeProprietario.trim().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Campo nome está vazio ", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
            
                String cpfProprietario = txt_proprietarioCPF.getText();
                    if(cpfProprietario == null || cpfProprietario.trim().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Campo CPF vazio ", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                    }   
            
                String matriculaProprietario = txt_proprietarioMatricula.getText();
                    if(matriculaProprietario == null || matriculaProprietario.trim().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Campo Matricula vazio ", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
            
                String carProprietario = txt_proprietarioCAR.getText();
                    if(carProprietario == null || carProprietario.trim().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Campo CAR vazio ", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
            
                String ccirProprietario = txt_proprietarioCCIR.getText();
                    if(ccirProprietario == null || ccirProprietario.trim().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Campo CCIR vazio", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
            
                String nirfProprietario = txt_proprietarioNIRF.getText();
                    if(nirfProprietario == null || nirfProprietario.trim().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Campo NIRF", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                    }
            
            Proprietario proprietario = new Proprietario();
                proprietario.setNomeProprietario(nomeProprietario);
                proprietario.setCpfProprietario(cpfProprietario);
                proprietario.setMatriculaProprietario(matriculaProprietario);
                proprietario.setCarProprietario(carProprietario);
                proprietario.setCcirProprietario(ccirProprietario);
                proprietario.setNirfProprietario(nirfProprietario);
            
            //inicializando a conexão
            ProprietarioDAO dao = new ProprietarioDAO();
            dao.cadastrarProprietario(proprietario);
            //limpando entradas após cadastro
            limpar();
            JOptionPane.showMessageDialog(this, "Cadastro Realizado");  
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, "Erro no banco de dados: " + e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
                  e.printStackTrace();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha ao cadastrar: " + e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_cadastroProprietarioActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProprietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProprietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastroProprietario;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_proprietarioCAR;
    private javax.swing.JTextField txt_proprietarioCCIR;
    private javax.swing.JFormattedTextField txt_proprietarioCPF;
    private javax.swing.JTextField txt_proprietarioMatricula;
    private javax.swing.JTextField txt_proprietarioNIRF;
    private javax.swing.JTextField txt_proprietarioNome;
    // End of variables declaration//GEN-END:variables
}
