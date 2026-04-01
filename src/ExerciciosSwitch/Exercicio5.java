package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

    System.out.println("digite o primeiro número: ");
        int numero1=scanner.nextInt();
        scanner.nextLine();

        System.out.println("digite o segundo número: ");
        int numero2=scanner.nextInt();
        scanner.nextLine();

    System.out.println("Calcular Média (M)");
    System.out.println("Caulcular diferença do maior pelo menor(S)");
    System.out.println("Caulcular o produto entre os números(P)");
    System.out.println("Calcular a divisão do primeiro pelo segundo(D)");
    System.out.println("Qual das opções acima você deseja(M, S, P, D): ");
    String escolha=scanner.nextLine().toUpperCase();

     switch(escolha){
            case "M": System.out.println((numero1 + numero2)/2);
                break;
            case "S": System.out.println(Math.max(numero1, numero2) - Math.min(numero1, numero2));
                break;
            case "P": System.out.println(numero1 * numero2);
                break;
            case "D": System.out.print(numero1 / numero2);
                 break;
            default: System.out.println("operação Inválida");
     }
    }
    
}
