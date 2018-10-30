package modelo;

public class Carro implements Comparable<Carro>{
    private int idCarro;
    private int tipo;
    private String placa;
    private String modelo;
    private String cor;

    public Carro (int tipo, String placa, String modelo, String cor){
        this.tipo = tipo;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public Carro (int tipo, String placa, String modelo){
        this.tipo = tipo;
        this.placa = placa;
        this.modelo = modelo;
    }
    
    public Carro (int tipo, String placa){
        this.tipo = tipo;
        this.placa = placa;
    }
    public Carro (int tipo){
        this.tipo = tipo;
    }
    
    public Carro (){
    }
    
    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public int compareTo(Carro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
