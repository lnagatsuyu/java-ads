import java.sql.*;

public class BancoDeDados {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public void conectar(){
        String servidor = "jdbc:mysql://localhost:3306/agenda";
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

    public void inserirContato(String nome, String telefone){
        String query;

        try {
            query = "INSERT INTO contato (nome,telefone) VALUES ('" + nome + "', '" + telefone + "')";
            this.statement.executeUpdate(query);
        }catch(Exception e){
            System.out.println("Erro na insercao");
            System.out.println(e.getMessage());
        }
    }

    public void listarContato(){
        String query;

        try{

            query = "SELECT * FROM contato ORDER BY nome";
            this.resultSet = statement.executeQuery(query);

            while(this.resultSet.next()){
                System.out.println("Codigo: " + this.resultSet.getString("id"));
                System.out.println("Nome: " + this.resultSet.getString("nome"));
                System.out.println("Fone: " + this.resultSet.getString("telefone"));
            }

        }catch(Exception e){
                System.out.println("Erro no SELECT");
                System.out.println(e.getMessage());
        }
   }

   public void apagarContato(String id){
        String query;

        try {
            query = "DELETE FROM contato WHERE id = " + id;
            this.statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println("Erro no DELETE");
            System.out.println(e.getMessage());
        }
   }

   public void atualizarContato(String id, String nome, String telefone){
        String query;

        try {
            query = "UPDATE contato SET nome = '" + nome + "', telefone ='" + telefone + "' WHERE id = " + id + ";";
            this.statement.executeUpdate(query);
        }catch(Exception e){
            System.out.println("Erro no UPDATE");
            System.out.println(e.getMessage());
        }
    }
}


