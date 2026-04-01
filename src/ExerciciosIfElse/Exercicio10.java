package ExerciciosIfElse;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro número: ");
        int num1=scanner.nextInt();

        System.out.println("digite o segundo número: ");
        int num2=scanner.nextInt();

        System.out.println("digite o terceiro número: ");
        int num3=scanner.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("Os números são iguais");
        }else{
           int maior = Math.max(num1, Math.max(num2, num3));
           System.out.println("O maior deles é " + maior);
        }

    }
    
}
