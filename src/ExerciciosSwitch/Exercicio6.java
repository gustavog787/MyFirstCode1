package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        String produto;
        double preço;

        switch (codigo) {
            case 100: produto = "Cachorro Quente";
                preço = 1.20;
                break;
            case 101:
                produto = "Bauru Simples";
                preço = 1.30;
                break;
            case 102:
                produto = "Bauru com ovo";
                preço = 1.50;
                break;
            case 103:
                produto = "Hambúrguer";
                preço = 1.20;
                break;
            case 104:
                produto = "Cheeseburguer";
                preço = 1.30;
                break;
            case 105:
                produto = "Refrigerante";
                preço = 1.00;
                break;
            default:
                System.out.println("Código inválido!");
                return;
        }

        

        System.out.println("Produto: " + produto);
        System.out.println("Total a pagar: R$" + preço * quantidade);

        scanner.close();
}
}
