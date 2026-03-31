import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Código | Produto          | Preço");
        System.out.println("__________________________________");
        System.out.println("100    | Cachorro quente  | 1,20");
        System.out.println("101    | Bauru Simples    | 1,30");
        System.out.println("102    | Bauru com ovo    | 1,50");
        System.out.println("103    | Hambúrguer       | 1,20");
        System.out.println("104    | Cheeseburguer    | 1,30");
        System.out.println("105    | Refrigerante     | 1,00");
        System.out.println("__________________________________");
        int resp = 1;
        double preço = 0;
        double total = 0;
        double totalMontante = 0;
        while (resp == 1) {
            System.out.println("insira o código do produto: ");
            int codigo = scanner.nextInt();

            System.out.println("insira a quntidade que deseja: ");
            int quantidade = scanner.nextInt();



            switch (codigo) {
                case 100 -> preço =1.20;
                case 101 -> preço = 1.30;
                case 102 -> preço =1.50;
                case 103 -> preço =1.20;
                case 104 -> preço =1.30;
                case 105 -> preço =1.00;
            }
            total= preço*quantidade;
            totalMontante += total;
            System.out.println("Total deste produto: R$" + total);

            System.out.println("Deseja comprar mais algum alimento?(1/0): ");
            resp= scanner.nextInt();
        }
        System.out.println("O Total da compra é de: R$ " + totalMontante);
    }
}
