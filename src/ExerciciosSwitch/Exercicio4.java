package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu plano de salário (A, B, C): ");
        String plano=scanner.nextLine().toUpperCase();

        System.out.print("Insira o seu salário atual: ");
        float salario=scanner.nextFloat();

        switch (plano) {
            case "A": System.out.printf("Seu salário depois do aumento é de de R$%.2f\n", salario * 1.10);
                break;
                 case "B": System.out.printf("Seu salário depois do aumento é de de R$%.2f\n", salario * 1.15);
                break;
                 case "C": System.out.printf("Seu salário depois do aumento é de de R$%.2f\n", salario * 1.20);
                break;
        
            default: System.out.println("Você não faz parte da empresa!!");
                break;
        }
    }
    
}
