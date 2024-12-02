package DAO;

import Controller.Conexao;
import Model.Proprietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ProprietarioDAO {
    
    public int cadastrarProprietario(Proprietario proprietario) throws SQLException{
        //fazer uma verificação no começo
        //verificado
        if (verificarProprietario(proprietario.getNomeProprietario(), proprietario.getMatriculaProprietario(), proprietario.getCpfProprietario(), 
                proprietario.getCarProprietario(), proprietario.getCcirProprietario(), proprietario.getNirfProprietario())) {
           throw new SQLException("Um proprietario cadastrado com o mesmo dado já existe.");     
        }           
        String sql = "INSERT INTO PROPRIETARIO(NOME_PROPRIETARIO, CPF, MATRICULA, CAR, CCIR, NIRF) VALUES(?, ?, ?, ?, ?, ?)";      
        try(Connection conn = Conexao.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1, proprietario.getNomeProprietario());
            ps.setString(2, proprietario.getCpfProprietario());
            ps.setString(3, proprietario.getMatriculaProprietario());
            ps.setString(4, proprietario.getCarProprietario());
            ps.setString(5, proprietario.getCcirProprietario());
            ps.setString(6, proprietario.getNirfProprietario());
   
            ps.executeUpdate();
            //obter key e retornando true ou -1 se for falso
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                return rs.getInt(1); 
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
            throw e; 
            }
        return -1;
    }
     
    //impedir que seja cadastrado propriedade com mesmos valores
    //verificado
    public boolean verificarProprietario(String nomeProprietario, String cpfProprietario, String matriculaProprietario, String carProprietario, String ccirProprietario, String nirfProprietario) throws SQLException{
         String sql = "SELECT COUNT(*) FROM PROPRIETARIO WHERE NOME_PROPRIETARIO = ? OR CPF = ? OR MATRICULA = ? OR CAR = ? OR CCIR = ? OR NIRF = ?";
         try(Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomeProprietario);
            ps.setString(2, cpfProprietario);
            ps.setString(3, matriculaProprietario);
            ps.setString(4, carProprietario);
            ps.setString(5, ccirProprietario);
            ps.setString(6, nirfProprietario);
              
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
    
    //confirma que existe o proprietario digitado
    //verificado
    public int buscarProprietarioNome(String nomeProprietario) throws SQLException{
        String sql = "SELECT  ID_PROPRIETARIO FROM PROPRIETARIO WHERE NOME_PROPRIETARIO = ?";
        try(Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomeProprietario);
            
            try(ResultSet rs = ps.executeQuery()) {
                if(rs.next()){
                    return rs.getInt("ID_PROPRIETARIO");
                }
            }   
        } catch (SQLException e) {
                e.printStackTrace();
            }
        return -1;
    }
    
    //juntando as tabelas com inner join
    //verificado
    public List<Object[]> carregarTabela(String pesquisa){
        String sql = "SELECT NOME_PROPRIETARIO, CPF, MATRICULA, CAR, CCIR, NIRF, NOME_PROPRIEDADE, BAIRRO_PROPRIEDADE, RUA_PROPRIEDADE, NUMERO_PROPRIEDADE, ID_PROPRIEDADE FROM PROPRIETARIO " +
                "INNER JOIN PROPRIEDADE ON PROPRIETARIO.ID_PROPRIETARIO = PROPRIEDADE.ID_PROPRIETARIO "+
                "WHERE UPPER(PROPRIETARIO.NOME_PROPRIETARIO) LIKE UPPER(?) OR UPPER (PROPRIETARIO.CPF) LIKE UPPER(?) OR (PROPRIETARIO.MATRICULA) LIKE UPPER(?)";
        
         //instanciando lista
        List<Object[]> resultados = new ArrayList<>();

        try (Connection con = Conexao.getConexao();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "%" + pesquisa + "%");//nome
            ps.setString(2, "%" + pesquisa + "%");//cpf
            ps.setString(3, "%" + pesquisa + "%");//matricula
            //fazer consulta
            ResultSet rs = ps.executeQuery();
         
            while (rs.next()) {
            //completando lista
                resultados.add(new Object[]{
                    rs.getString("NOME_PROPRIETARIO"),
                    rs.getString("CPF"),
                    rs.getString("MATRICULA"),
                    rs.getString("CAR"),
                    rs.getString("CCIR"),
                    rs.getString("NIRF"),
                    rs.getString("NOME_PROPRIEDADE"),
                    rs.getString("BAIRRO_PROPRIEDADE"),
                    rs.getString("RUA_PROPRIEDADE"),
                    rs.getString("NUMERO_PROPRIEDADE"),
                    rs.getString("ID_PROPRIEDADE")
                    
                });
                //mensagem para testar
                System.out.println("Resultado encontrado: " + Arrays.toString(resultados.get(resultados.size() - 1)));
            }
        } catch (SQLException e) {
        e.printStackTrace();
            }
        return resultados;
    }
    
   //Deletar proprietario
    //código instável, fazer alterações
    public boolean deletarProprietario(String nomeProprietario) {
        String excluirProprietario = "DELETE FROM PROPRIETARIO WHERE nome_proprietario = ?";
        try (Connection con = Conexao.getConexao()) {
            try (PreparedStatement ps = con.prepareStatement(excluirProprietario)) {
                ps.setString(1, nomeProprietario);
                int linhasAfetadas = ps.executeUpdate();
                //se for encontrado a linha retorna true
                return linhasAfetadas > 0; 
            }
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    } 
}
