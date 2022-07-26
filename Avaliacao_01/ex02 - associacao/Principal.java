public class Principal {
    public static void main(String[] args){

        Endereco endereco_01 = new Endereco("Republica Argentina", 89, "portao", "Curitiba" , "Parana");
        Funcionario funcionario_01 = new Funcionario("Jose Silva", 123, endereco_01);

        Endereco endereco_02 = new Endereco("Itatiaia", 1029, "portao", "curitiba", "parana");
        Funcionario funcionario_02 = new Funcionario("Marco Antonio", 324, endereco_02);

        System.out.println(funcionario_01.retornaFuncionario());
        System.out.println(funcionario_01.getEndereco().retornaEndereco());

        System.out.println(funcionario_02.retornaFuncionario());
        System.out.println(funcionario_02.getEndereco().retornaEndereco());

    }
}
