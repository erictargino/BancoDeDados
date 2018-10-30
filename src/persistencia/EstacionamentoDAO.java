package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Estacionamento;

public class EstacionamentoDAO {
    private final Conexao con = new Conexao();
    
    private final static String INSERTESTACIONAMENTO = "INSERT INTO ESTACIONAMENTO VALUES (nome, tamanho, tipo, valor) VALUES (?,?,?,?)";
    private final static String UPDATEESTACIONAMENTO = "UPDATE ESTACIONAMENTO SET nome = ?, tamanho = ?, tipo = ?, valor = ?";
    private final String DELETEESTACIONAMENTO = "DELETE FROM ESTACIONAMENTO WHERE id_estacionamento = ?";
    private final String LISTESTACIONAMENTO= "SELECT * FROM ESTACIONAMENTO ORDER BY ID_ESTACIONAMENTO";
    
    public boolean inserirEstacionamento(Estacionamento a){
        
        con.conecta();
        
        try{
            
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(INSERTESTACIONAMENTO);
            
            preparaInstrucao.setString(1, a.getNome().toUpperCase());
            preparaInstrucao.setInt(2, a.getTamanho());
            preparaInstrucao.setInt(3, a.getTipo());
            preparaInstrucao.setDouble(4, a.getValor());
            
            preparaInstrucao.execute();
            con.desconecta();
			
            return true;   
        }catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean updateEstacionamento(Estacionamento a){
        
        
        try {
		
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(UPDATEESTACIONAMENTO);

			
            preparaInstrucao.setString(1, a.getNome().toUpperCase());
            preparaInstrucao.setInt(2, a.getTamanho());
            preparaInstrucao.setInt(3, a.getTipo());
            preparaInstrucao.setDouble(4, a.getValor());
            
            preparaInstrucao.execute();

            con.desconecta();
			
            return true;

            } catch (SQLException e) {
		return false;

        }
    }
    
    public boolean deleteEstacionamento(int idEstacionamento){
        
        try {
            
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(DELETEESTACIONAMENTO);

            preparaInstrucao.setInt(1, idEstacionamento);

            preparaInstrucao.execute();

            con.desconecta();
			
            return true;

            } catch (SQLException e) {
                return false;

        }    
    }
    
  public ArrayList<Estacionamento> listarEstacionamento(){
      
      ArrayList<Estacionamento> lista = new ArrayList<>(); 

	try {
			
            con.conecta();
            PreparedStatement preparaInstrucao;
            preparaInstrucao = con.getConexao().prepareStatement(LISTESTACIONAMENTO); 
			
            ResultSet rs = preparaInstrucao.executeQuery(); 
			
            while (rs.next()) { 
                
                Estacionamento a = new Estacionamento(rs.getString("nome"),rs.getInt("tamanho"),rs.getInt("tipo"), rs.getDouble("valor"));
		lista.add(a); 
                
            }
            
            con.desconecta();
            
            } catch (SQLException e) {
            }
            return lista;

      
  } 
}
