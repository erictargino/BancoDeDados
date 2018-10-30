package persistencia;

import java.sql.*; //importa todas as classes da api java.sql

/**
 * CLASSE QUE CONFIGURA A CONEXAO COM O BANCO DE DADOS 
 *
 */
public class Conexao {
    //ATRIBUTOS DA CLASSE
    private static final String USUARIO = "postgre";	
    private static final String SENHA = "postgre";
    private static final String CAMINHO = "jdbc:postgresql://localhost:5432/poo";
    private static final String DRIVER = "org.postgresql.Driver";
    private Connection conexao;		

    //METODO QUE EFETUA A CONEXAO COM O BANCO DE DADOS
    public void conecta() {
            try {
                    Class.forName(DRIVER); //Carrega o driver (inicializa um objeto da classe org.postgresql.Driver) 
                    conexao = DriverManager.getConnection(CAMINHO, USUARIO,SENHA); //Cria a conexao
            } catch (ClassNotFoundException | SQLException e) {
                    System.err.println(e);
            }
    }

    //METODO QUE DESCONECTA O BANCO DE DADOS
    public void desconecta() {
            try {
                    conexao.close();//fecha a conexao
            } catch (SQLException ex) {
                    System.err.println(ex);
            }
    }

    public Connection getConexao() {
            return conexao;
    }
}
