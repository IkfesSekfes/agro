package DAO;

import Controller.Conexao;
import Model.Propriedade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PropriedadeDAO {
    
    public boolean cadastrarPropriedade(Propriedade propriedade, int proprietarioFK)throws SQLException{
        //implementando a verificação no cadastro
        //verificado
        if(verificarPropriedade(propriedade.getNomePropriedade(), propriedade.getNumeroPropriedade())){
            throw new SQLException("Uma propriedade cadastrada com o mesmos dados já existe.");
           
    }
        //inserindo dados
        String sql = "INSERT INTO PROPRIEDADE(NOME_PROPRIEDADE, RUA_PROPRIEDADE, BAIRRO_PROPRIEDADE, NUMERO_PROPRIEDADE, ID_PROPRIETARIO) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexao.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
          ps.setString(1,propriedade.getNomePropriedade());
          ps.setString(2, propriedade.getRuaPropriedade());
          ps.setString(3, propriedade.getBairroPropriedade());
          ps.setString(4, propriedade.getNumeroPropriedade());
          ps.setInt(5, proprietarioFK);
        
          ps.execute();
          return true;
          
          
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

    }
    
    //função para que possamos verificar e impedir que sejam cadastradas propriedades que possuem mesmo número e nome
    //verificada
    public boolean verificarPropriedade(String nomePropriedade, String numeroPropriedade) throws SQLException{
  
       
        String sql = "SELECT COUNT(*) FROM PROPRIEDADE WHERE NOME_PROPRIEDADE = ? OR NUMERO_PROPRIEDADE = ?";
        try(Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
             ps.setString(1,nomePropriedade);
             ps.setString(2, numeroPropriedade); 
             
             try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0; 
                }
            }
             
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return false;
    }
     //função para deletar linha de propriedade de um proprietário selecionado na tabela usando id
    //verificada
    public boolean deletarPropriedadeID(int propriedadePK){
        String excluirPropriedade = "DELETE FROM PROPRIEDADE WHERE ID_PROPRIEDADE = ?";

    //remove a propriedade e retorna true e false se houver problema
        try (Connection con = Conexao.getConexao()) {
            try (PreparedStatement psPropriedade = con.prepareStatement(excluirPropriedade)) {
                psPropriedade.setInt(1, propriedadePK);
                int linhasAfetadasPropriedade = psPropriedade.executeUpdate();
            return linhasAfetadasPropriedade > 0;  
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false; 
    }
}
    //função para modificar tabela
    //verificado
    public boolean atualizarPropriedade(Propriedade propriedade) {
    String sql = "UPDATE propriedade SET nome_propriedade = ?, numero_propriedade = ?, bairro_propriedade = ?, rua_propriedade = ? WHERE id_propriedade = ?";
    try (Connection con = Conexao.getConexao();
         PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, propriedade.getNomePropriedade());
            ps.setString(2, propriedade.getNumeroPropriedade());
            ps.setString(3, propriedade.getBairroPropriedade());
            ps.setString(4, propriedade.getRuaPropriedade());
            ps.setInt(5, propriedade.getPropriedadePK());
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

    
}
