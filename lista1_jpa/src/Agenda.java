public class Agenda {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();

        bancoDeDados.conectar();

        if(bancoDeDados.isConnected()){
            System.out.println("Banco de dados conectado");
        }else{
            System.out.println("Banco de dados nao conectado");
        }

        //bancoDeDados.inserirContato("SENAC PR", "0800 643 6 346");
        bancoDeDados.listarContato();
        //bancoDeDados.apagarContato("");
        //bancoDeDados.atualizarContato("1", "SENAC PR", "3314-5850");
        //bancoDeDados.listarContato();
    }
}
