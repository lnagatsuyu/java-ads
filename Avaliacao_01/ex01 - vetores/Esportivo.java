public class Esportivo extends Carro{

    protected int potencia;

    public Esportivo(String marca, int ano, float preco, int potencia) {
        super(marca, ano, preco);
        this.potencia = potencia;
    }

    public Esportivo() {
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String mostraCarro(){
        return "Marca: " + this.marca + "Ano: " + this.ano + "Preco: " + this.preco + "Potencia: " + this.potencia;
    }
}
