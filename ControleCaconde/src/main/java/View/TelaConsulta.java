package View;

import DAO.PropriedadeDAO;
import DAO.ProprietarioDAO;
import Model.Propriedade;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wesley
 */
public class TelaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsulta
     */
    public TelaConsulta() {  
        initComponents();
        //para exibir texto  ao passar com mouse por cima
        btn_modificar.setToolTipText("<html><font color='green'><b>Confirma alteração em linha modificada</b></font></html>");
        btn_confirma.setToolTipText("<html><font color='green'><b>Pesquisa proprietário cadastrado</b></font></html>");
        btn_deletar.setToolTipText("<html><font color='red'><b>Exclui linha selecionada</b></font></html>");
        btn_deletarProprietario.setToolTipText("<html><font color='red'><b>Exclui proprietário digitado</b></font></html>");
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
        jLabel1 = new javax.swing.JLabel();
        btn_confirma = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_deletar = new javax.swing.JButton();
        txt_pesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_consulta = new javax.swing.JTable();
        btn_voltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_deletarProprietario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 75, 75));
        jLabel1.setText("CONSULTA");

        btn_confirma.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_confirma.setText("Confirmar");
        btn_confirma.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        btn_confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmaActionPerformed(evt);
            }
        });

        btn_modificar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        btn_modificar.setPreferredSize(new java.awt.Dimension(59, 20));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_deletar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_deletar.setText("Propriedade Selecionada");
        btn_deletar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        txt_pesquisar.setBackground(new java.awt.Color(187, 187, 187));

        tabela_consulta.setBackground(new java.awt.Color(204, 204, 204));
        tabela_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Matrícula", "CAR", "CCIR", "NIRF", "Propriedade", "Bairro", "Rua", "Número", "Propriedade ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_consulta.setGridColor(new java.awt.Color(204, 204, 204));
        tabela_consulta.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tabela_consulta);

        btn_voltar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 75, 75));
        jLabel2.setText("Pesquisar:");

        btn_deletarProprietario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btn_deletarProprietario.setText(" Proprietario Pesquisado");
        btn_deletarProprietario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(140, 140, 140), new java.awt.Color(176, 176, 176)));
        btn_deletarProprietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarProprietarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(75, 75, 75));
        jLabel3.setText("DELETAR:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(btn_confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_deletar, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(btn_deletarProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(496, 496, 496)
                .addComponent(btn_voltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btn_deletar))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(btn_confirma)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_deletarProprietario))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_voltar)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void btn_confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmaActionPerformed
        //verificado
        String pesquisa = txt_pesquisar.getText();
            System.out.println("Pesquisa: " + pesquisa);
       
             // Validando se o campo de pesquisa está vazio
        if (pesquisa == null || pesquisa.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Insira informação.");
        return;
        }
        try{
            ProprietarioDAO proprietarioDAO = new ProprietarioDAO();
            List<Object[]>resultados = proprietarioDAO.carregarTabela(pesquisa);

            //limpando tabelas
            DefaultTableModel model = (DefaultTableModel) tabela_consulta.getModel();
            model.setRowCount(0);
        
            //preenchendo a tabela com dados
            if (!resultados.isEmpty()) {
                for (Object[] resultado : resultados) {
                    model.addRow(resultado);
                }
            } else {
            //se não existir retorna mensagem
                JOptionPane.showMessageDialog(this, "Nenhum resultado encontrado. Proprietario não possui propriedade cadastrada");
            }
        }catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao realizar a consulta: " + e.getMessage());
            }

    }//GEN-LAST:event_btn_confirmaActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
        //verificado
        int linhaEscolhida = tabela_consulta.getSelectedRow();
        // Verifica se foi selecionada alguma linha
        if (linhaEscolhida == -1) {
            JOptionPane.showMessageDialog(this, "Escolha a linha a ser deletada.");
        return;
        }
        // Recuperar propriedade da coluna
        DefaultTableModel model = (DefaultTableModel) tabela_consulta.getModel();
        String intPropriedadePK = (String) model.getValueAt(linhaEscolhida, 10); 
        int propriedadePK = -1;
        
        try {
            propriedadePK = Integer.parseInt(intPropriedadePK);
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao obter ID da propriedade. Valor inválido.");
        return;
            }
    
        // Verificar se o ID da propriedade é válido
        if (propriedadePK <= 0) {
            JOptionPane.showMessageDialog(this, "Erro ao obter ID da propriedade.");
        return;
        }
            System.out.println("Propriedade ID: " + propriedadePK);  // Log para verificar o ID
    
        PropriedadeDAO dao = new PropriedadeDAO();
    
        // Chama o método para deletar a propriedade
        boolean correto = dao.deletarPropriedadeID(propriedadePK);
            System.out.println("Exclusão realizada: " + correto);
    
        if (correto) {
            JOptionPane.showMessageDialog(this, "Propriedade excluída com sucesso!");
            model.removeRow(linhaEscolhida);  // Remove a linha da tabela
        } else {
            JOptionPane.showMessageDialog(this, "Erro! Não foi possível excluir a propriedade.");
        }
    }//GEN-LAST:event_btn_deletarActionPerformed

    private void btn_deletarProprietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarProprietarioActionPerformed
       // Obter o texto do campo de pesquisa
       //verficado
        String entrada = txt_pesquisar.getText().trim();

        // Verifica se a entrada está vazia ou contém apenas números
        if (entrada.isEmpty() || entrada.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Digite um nome válido para proprietário. ","Aviso",
            JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Confirmação do usuário
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseeja excluir o proprietario \"" + entrada + "\" e todas as suas propriedades?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        //caso usuário desista de deletar
        if (confirmacao != JOptionPane.YES_OPTION) {
            return; 
        }

        // Excluir proprietário
        ProprietarioDAO dao = new ProprietarioDAO();
        boolean sucesso = dao.deletarProprietario(entrada);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Proprietário e suas propriedades excluídos com sucesso.");   
            // Limpa o campo de pesquisa
            txt_pesquisar.setText("");
            // Atualiza a tabela, caso esteja exibindo resultados
            DefaultTableModel model = (DefaultTableModel) tabela_consulta.getModel();
            model.setRowCount(0);  // Limpa todas as linhas da tabela

        
        }else{
        JOptionPane.showMessageDialog(this, "Erro ao excluir o proprietário. Verifique se o nome está correto ou se existe no sistema.",
            "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_deletarProprietarioActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
         //verificado
        int linhaSelecionada = tabela_consulta.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para modificar.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tabela_consulta.getModel();

        try {
        // Suponha que o ID da propriedade está na coluna 10
            int propriedadePK = Integer.parseInt(model.getValueAt(linhaSelecionada, 10).toString());
            String nomePropriedade = model.getValueAt(linhaSelecionada, 6).toString();
            String numeroPropriedade = model.getValueAt(linhaSelecionada, 9).toString();
            String bairroPropriedade = model.getValueAt(linhaSelecionada, 7).toString();
            String ruaPropriedade = model.getValueAt(linhaSelecionada, 8).toString();

            Propriedade propriedadeAtualizada = new Propriedade();
                propriedadeAtualizada.setPropriedadePK(propriedadePK);
                propriedadeAtualizada.setNomePropriedade(nomePropriedade);
                propriedadeAtualizada.setNumeroPropriedade(numeroPropriedade);
                propriedadeAtualizada.setBairroPropriedade(bairroPropriedade);
                propriedadeAtualizada.setRuaPropriedade(ruaPropriedade);

        // Atualizar no banco de dados
            PropriedadeDAO dao = new PropriedadeDAO();
            boolean sucesso = dao.atualizarPropriedade(propriedadeAtualizada);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Propriedade atualizada com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao atualizar a propriedade.");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro: o ID da propriedade está inválido.");
            e.printStackTrace();
            }
    }//GEN-LAST:event_btn_modificarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirma;
    private javax.swing.JButton btn_deletar;
    private javax.swing.JButton btn_deletarProprietario;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_consulta;
    private javax.swing.JTextField txt_pesquisar;
    // End of variables declaration//GEN-END:variables
}
