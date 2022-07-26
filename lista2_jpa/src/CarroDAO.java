import java.sql.ResultSet;

public class CarroDAO {
    Conexao conexao = null;

    public CarroDAO(){
        this.conexao = new Conexao();
        this.conexao.conectar();
    }

    public void incluir(Carro carro){
        String query = "INSERT INTO carro VALUES ('" + carro.getPlaca() + "', '"
                        + carro.getModelo() + "', "
                        + carro.getPotencia() + ")";

        this.conexao.executarAtualizacao(query);
    }

    public Carro consultarPorPlaca(String placa){
        Carro carro = null;

        try{
            String query = "SELECT * FROM carro WHERE placa = '" + placa + "'";
            ResultSet resultSet = this.conexao.executarConsulta(query);
            if(resultSet.next()){
                carro = new Carro();
                carro.setModelo(resultSet.getString("modelo"));
                carro.setPlaca(resultSet.getString("placa"));
                carro.setPotencia(resultSet.getDouble("potencia"));
            }
        }catch(Exception e){
            System.out.println("Erro no SELECT por placa");
            System.out.println(e.getMessage());
        }
        return carro;
    }

    public void alterarPorPlaca(Carro carro){
        String query = "UPDATE carro SET modelo = '" + carro.getModelo() +
                       "', potencia = " + carro.getPotencia() + " WHERE placa = '" +
                        carro.getPlaca() + "'";
        this.conexao.executarAtualizacao(query);
    }

    public void excluir(Carro carro){
        String query = "DELETE FROM carro WHERE placa ='" + carro.getPlaca() + "'";
        this.conexao.executarAtualizacao(query);
    }
}
