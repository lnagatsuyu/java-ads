public class Sedan extends Carro{

    protected int portaMalas;

    public Sedan(String marca, int ano, float preco , int portaMalas) {
        super(marca, ano, preco);
        this.portaMalas = portaMalas;
    }
    public Sedan(){
    }

    public int getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }

    public String mostraCarro(){
        return "Marca: " + this.marca + "Ano: " + this.ano + "Preco: " + this.preco + "Porta Malas: " + this.portaMalas;
    }
}
