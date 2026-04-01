package ExerciciosIfElse;
import java.util.Scanner;

public class Exercicio13{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        double numero1;
        String operator;
        double numero2;

        System.out.print("Insira o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Insira o operador ( +, -, *, /, ^): ");
        operator = scanner.nextLine();

        System.out.print("insira o segundo número: ");
        numero2 = scanner.nextDouble();



            switch(operator){
            case "+":
             System.out.println(numero1 + numero2);
            case "-":
                System.out.println(numero1 - numero2);
                break;
            case "*":
                System.out.println(numero1 * numero2);
                break;
            case "/":
                 if(numero2<=0){
                    System.out.println("IMPOSSÍVEL DIVIDIR!");
                 }else{System.out.print(numero1 / numero2);}
                 break;
            case "^":
                 System.out.println(Math.pow(numero1, numero2));
                 break;
            default:
                    System.out.println("sinal inválido");

    
        }
}
}
