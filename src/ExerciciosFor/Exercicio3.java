package ExerciciosFor;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o limite que você deseja para o loop: ");
        int limite=scanner.nextInt();
        for(int i=1;i<=limite;i++){
            System.out.print(i + ", ");
        }
    }
    
}
