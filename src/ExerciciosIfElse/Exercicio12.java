package ExerciciosIfElse;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o seu salário: ");
        float salario = scanner.nextFloat();

        if(salario<=600){
            System.out.println("Você é isento do desconto do INSS!!");
        }
         else if(salario > 600 && salario <= 1200){
            System.out.println("Você deve pagar " + salario * 0.20 + " ao INSS!!");
        }
         else if(salario > 1200 && salario <= 2000){
            System.out.println("Você deve pagar " + salario * 0.25 + " ao INSS!!");
        }
         else if(salario > 2000){
            System.out.println("Você deve pagar " + salario * 0.30 + " ao INSS!!");
        }
    }
    
}
