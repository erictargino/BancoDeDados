package modelo;

public class Usuario implements Comparable<Usuario>{
    private int idUsuario;
    private String nome;
    private int cpf;
    
    public Usuario (String nome, int idUsuario, int cpf){
        this.nome = nome;
        this.idUsuario = idUsuario;
        this.cpf = cpf;
    }
    public Usuario (String nome, int idUsuario){
        this.nome = nome;
        this.idUsuario = idUsuario;
    }
    public Usuario ( int cpf){
        this.cpf = cpf;
    }
    
    public Usuario (){
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public int compareTo(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
