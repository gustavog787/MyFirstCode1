package ExerciciosIfElse;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("qual é o seu salário: ");
    float salario = scanner.nextFloat();
    
    System.out.println("qual é o valor da sua prestação");
    float prest = scanner.nextFloat();

    if(prest <= salario * 0.30){
        System.out.println("Empréstimo aprovado");
    }else{
        System.out.println("Empréstimo não aprovado");
    }
    }
    
}
