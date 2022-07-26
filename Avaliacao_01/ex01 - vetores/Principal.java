import java.util.Scanner;

public class Principal  {
    public static void main(String[] args){

        double valorTotal = 0;

        Scanner read = new Scanner(System.in);
        Carro[] carros = new Carro[3];

        Sedan carroSedan;
        Esportivo carroEsportivo;

        for(int i = 0; i < carros.length; i++){

            System.out.println("Insira o tipo do carro: 1 - Carro Sedan   ||  2 - Carro Esportivo");
            int opcao = read.nextInt();
            read.nextLine();

            if(opcao == 1){

                carroSedan = new Sedan();
                System.out.println("Carro Sedan " + (i + 1));

                System.out.println("Insira a marca");
                carroSedan.setMarca(read.nextLine());

                System.out.println("Insira o ano");
                carroSedan.setAno(read.nextInt());
                read.nextLine();

                System.out.println("Insira o preco");
                carroSedan.setPreco(read.nextFloat());
                read.nextLine();

                System.out.println("Insira o porta malas");
                carroSedan.setPortaMalas(read.nextInt());
                read.nextLine();

                carros[i] = carroSedan;

            }else if(opcao == 2){

                carroEsportivo = new Esportivo();
                System.out.println("Carro esportivo " + (i + 1));

                System.out.println("Insira o Marca");
                carroEsportivo.setMarca(read.nextLine());

                System.out.println("Insira o ano");
                carroEsportivo.setAno(read.nextInt());

                System.out.println("Insira o preco");
                carroEsportivo.setPreco(read.nextFloat());

                System.out.println("Insira o potencia");
                carroEsportivo.setPotencia(read.nextInt());
                read.nextLine();

                carros[i] = carroEsportivo;

            }else{
                System.out.println("Opcao incorreta");
                i--;
            }
        }

        for(int i = 0 ; i < carros.length; i ++){
            if(carros[i] instanceof Sedan){

                System.out.println("\n Carro 0" + (i+1) + ": " );
                carroSedan = (Sedan) carros[i];
                System.out.println("Marca: " + carroSedan.getMarca());
                System.out.println("Ano: " + carroSedan.getAno());
                System.out.println("Preco: " + carroSedan.getPreco());
                System.out.println("Porta malas: " + carroSedan.getPortaMalas());

            }else if(carros[i] instanceof Esportivo){
                System.out.println("\n Carro 0" + (i+1) + ": ");
                carroEsportivo = (Esportivo) carros[i];
                System.out.println("Marca: " + carroEsportivo.getMarca());
                System.out.println("Ano: " + carroEsportivo.getAno());
                System.out.println("Preco: " + carroEsportivo.getPreco());
                System.out.println("Potencia: " + carroEsportivo.getPotencia());

            }
            valorTotal = valorTotal + carros[i].preco;
        }

        System.out.println("Valor total: " + valorTotal);
    }
}
