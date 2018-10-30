package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Carro;

public class CarroDAO {
    private final Conexao con = new Conexao();
    
    private final static String INSERTCARRO = "INSERT INTO CARRO VALUES (nome, tamanho, tipo, valor) VALUES (?,?,?,?)";
    private final static String UPDATECARRO = "UPDATE CARRO SET nome = ?, tamanho = ?, tipo = ?, valor = ?";
    private final String DELETECARRO = "DELETE FROM CARRO WHERE id_carro = ?";
    private final String LISTCARRO= "SELECT * FROM CARRO ORDER BY ID_CARRO";
    
    public boolean inserirCarro(Carro a){
        
        con.conecta();
        
        try{
            
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERTCARRO);
            
            preparaInstrucao.setInt(1, a.getTipo());
            preparaInstrucao.setString(2, a.getPlaca().toUpperCase());
            preparaInstrucao.setString(3, a.getModelo().toUpperCase());
            preparaInstrucao.setString(4, a.getCor().toUpperCase());           
            preparaInstrucao.execute();
            con.desconecta();
			
            return true;   
        }catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean updateCarro(Carro a){
        
        
        try {
		
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(UPDATECARRO);

			
            preparaInstrucao.setInt(1, a.getTipo());
            preparaInstrucao.setString(2, a.getPlaca().toUpperCase());
            preparaInstrucao.setString(3, a.getModelo().toUpperCase());
            preparaInstrucao.setString(4, a.getCor().toUpperCase());
            
            preparaInstrucao.execute();

            con.desconecta();
			
            return true;

            } catch (SQLException e) {
		return false;

        }
    }
    
    public boolean deleteCarro(int id_Carro){
        
        try {
            
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(DELETECARRO);

            preparaInstrucao.setInt(1, id_Carro);

            preparaInstrucao.execute();

            con.desconecta();
			
            return true;

            } catch (SQLException e) {
                return false;

        }    
    }
    
  public ArrayList<Carro> listarCarro(){
      
      ArrayList<Carro> lista = new ArrayList<>(); 

	try {
			
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(LISTCARRO); 
			
            ResultSet rs = preparaInstrucao.executeQuery(); 
			
            while (rs.next()) { 
                
                Carro a = new Carro(rs.getInt("tipo"), rs.getString("placa"), rs.getString("modelo"), rs.getString("cor"));
		lista.add(a); 
                
            }
            
            con.desconecta();
            
            } catch (SQLException e) {
            }
            return lista;

      
  }
}
