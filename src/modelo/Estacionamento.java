package modelo;

public class Estacionamento implements Comparable<Estacionamento>{
    private int idEstacionamento;
    private String nome;
    private int tamanho;
    private int tipo;
    private double valor;

    public Estacionamento (int idEstacionamento, String nome){
        this.nome = nome;
        this.idEstacionamento = idEstacionamento;
    }
    
    public Estacionamento (int idEstacionamento,String nome, int tamanho){
        this.nome = nome;
        this.idEstacionamento = idEstacionamento;
        this.tamanho = tamanho;
    }
    
    public Estacionamento (int idEstacionamento){
        this.idEstacionamento = idEstacionamento;
    }
    public Estacionamento (){

    }

    public Estacionamento(String nome, int tamanho, int tipo, double valor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.valor = valor;
    }
            
    public int getIdEstacionamento() {
        return idEstacionamento;
    }

    public void setIdEstacionamento(int idEstacionamento) {
        this.idEstacionamento = idEstacionamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Estacionamento t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
