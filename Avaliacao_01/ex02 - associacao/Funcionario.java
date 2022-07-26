public class Funcionario {

    protected String nome;
    protected int cod;

    protected Endereco endereco;

    public Funcionario(String nome, int cod, Endereco endereco) {
        this.nome = nome;
        this.cod = cod;

        this.endereco = endereco;
    }

    public Funcionario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String retornaFuncionario(){
        return "Nome: " + this.nome + "\nCodigo: " + this.cod;
    }
}
