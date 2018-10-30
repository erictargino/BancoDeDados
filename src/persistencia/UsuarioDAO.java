package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Usuario;

public class UsuarioDAO {
    private final Conexao con = new Conexao();
    
    private final static String INSERTUSUARIO = "INSERT INTO USUARIO VALUES (NOME, CPF) VALUES (?,?)";
    private final static String UPDATEUSUARIO = "UPDATE USUARIO SET NOME = ?, CPF = ?";
    private final String DELETEUSUARIO = "DELETE FROM USUARIO WHERE ID_USUARIO = ?";
    private final String LISTUSUARIO= "SELECT * FROM USUARIO ORDER BY ID_USUARIO";
    
    public boolean inserirUsuario(Usuario a){
        
        con.conecta();
        
        try{
            
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERTUSUARIO);
            
            preparaInstrucao.setString(1, a.getNome().toUpperCase());
            preparaInstrucao.setInt(2, a.getCpf());
            
            preparaInstrucao.execute();
            con.desconecta();
			
            return true;   
        }catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean updateUsuario(Usuario a){
        
        
        try {
		
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(UPDATEUSUARIO);

			
            preparaInstrucao.setString(1, a.getNome().toUpperCase());
            preparaInstrucao.setInt(2, a.getCpf());
            
            preparaInstrucao.execute();

            con.desconecta();
			
            return true;

            } catch (SQLException e) {
		return false;

        }
    }
    
    public boolean deleteUsuario(int idUsuario){
        
        try {
            
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(DELETEUSUARIO);

            preparaInstrucao.setInt(1, idUsuario);

            preparaInstrucao.execute();

            con.desconecta();
			
            return true;

            } catch (SQLException e) {
                return false;

        }    
    }
    
  public ArrayList<Usuario> listarUsuario(){
      
      ArrayList<Usuario> lista = new ArrayList<>(); 

	try {
			
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(LISTUSUARIO); 
			
            ResultSet rs = preparaInstrucao.executeQuery(); 
			
            while (rs.next()) { 
                
                Usuario a = new Usuario(rs.getString("nome"),rs.getInt("cpf"));
		lista.add(a); 
                
            }
            
            con.desconecta();
            
            } catch (SQLException e) {
            }
            return lista;

      
  }
    
}

