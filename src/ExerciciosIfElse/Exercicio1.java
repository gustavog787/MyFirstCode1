package ExerciciosIfElse;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número Inteiro: ");
        int num=scanner.nextInt();

        if(num > 20){
            System.out.println(num/2);
        }
    }
    
}
