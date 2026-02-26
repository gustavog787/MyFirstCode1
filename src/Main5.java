import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        double result;

        System.out.print("Insira o valor A (que é acompanhado por x²): ");
        a = scanner.nextDouble();

        System.out.print("Insira o valor B ( que é acompanhado por x): ");
        b = scanner.nextDouble();

        System.out.print("Insira o valor C (termo independente): ");
        c = scanner.nextDouble();


        result = (Math.pow(b, 2) - 4 * a * c);

        System.out.println(" O valor de Delta é: " + result);


        scanner.close();
    }
}
