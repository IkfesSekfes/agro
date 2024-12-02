package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
     //versão principal
  /*
    private static final String url = "jdbc:mysql://localhost:3306/projetopp";
    private static final String user = "root";
    private static final String password = "9631";
   
    //versão de testes casa    
    */
    private static final String url = "jdbc:mysql://localhost:3306/projetopp";
    private static final String user = "root";
    private static final String password = "0112";    

    private static Connection conn;

    //abrir a conexão
    public static Connection getConexao(){
       
         try {
            if(conn == null || conn.isClosed()){     
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Conexao estabelecida!");
                     
            }        
         }catch (SQLException e) {
               e.printStackTrace();
               System.out.println("Erro ao tentar conectar");
            }
         return conn;
    }

    //fechar conexão
    public static void fecharConexao(){
        if(conn != null ){
            try{
                conn.close();
                conn = null;
                System.out.println("Conexao fechada");
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("Error: Fechar conexao");
            }
        }
    }
}
