package ExerciciosIfElse;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o primeiro número");
        float num1=scanner.nextFloat();

        System.out.println("Insira o segundo número");
        float num2=scanner.nextFloat();

       if(num1>num2){
       System.out.println(num1);
       System.out.println(num2);
       }else{
        System.out.println(num2);
        System.out.println(num1);
       }
    }
    
}
