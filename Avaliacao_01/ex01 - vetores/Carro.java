public abstract class Carro {
    protected String marca;
    protected int ano;
    protected float preco;

    public Carro(String marca, int ano, float preco) {
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public abstract String mostraCarro();
}
