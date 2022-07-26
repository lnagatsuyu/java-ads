import java.sql.*;

public class Conexao {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public void conectar(){
        String servidor = "jdbc:mysql://localhost:3306/loja_carro";
        String usuario = "root";
        String senha = "1234";

        try{
            this.connection = DriverManager.getConnection(servidor, usuario, senha);
            this.statement = this.connection.createStatement();
        }catch(Exception e){
            System.out.println("Erro na conexao");
            System.out.println(e.getMessage());
        }
    }

    public boolean isConnected(){
        if(this.connection != null){
            return true;
        }else{
            return false;
        }
    }

    public ResultSet executarConsulta(String consulta){
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(consulta);
        }catch (Exception e){
            System.out.println("Erro ao executar a consulta \n" + consulta);
            System.out.println(e.getMessage());
        }
        return resultSet;
    }

    public void executarAtualizacao(String atualiza){
        try{
            statement = connection.createStatement();
            statement.execute(atualiza);
        }catch(Exception e){
            System.out.println("Erro na execucao da atualizacao: \n" + atualiza);
            System.out.println(e.getMessage());
        }
    }
}


