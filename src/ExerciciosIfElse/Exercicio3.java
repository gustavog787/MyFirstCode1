package ExerciciosIfElse;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int num1=scanner.nextInt();
        
        System.out.print("Insira o segundo número: ");
        int num2=scanner.nextInt();

        if(num1==num2){
            System.out.println("números iguais");
        }else{
            System.out.println(Math.max(num1, num2) - Math.min(num1, num2));
        }
    }
    
}
