import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        String operator;
        double secondNumber;

        System.out.print("Enter a first number: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter an operator ( +, -, *, /, ^): ");
        operator = scanner.next();

        System.out.print("Enter a second number: ");
        secondNumber = scanner.nextDouble();

        switch(operator){
            case "+" -> System.out.print(firstNumber + secondNumber);
            case "-" -> System.out.print(firstNumber - secondNumber);
            case "*" -> System.out.print(firstNumber * secondNumber);
            case "/" -> System.out.print(firstNumber / secondNumber);
            case "^" -> System.out.print(Math.pow(firstNumber, secondNumber));
        }

    }
}
