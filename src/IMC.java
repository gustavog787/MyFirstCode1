import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("você é do sexo masculino ou feminino (M ou F): ");
        String sexo = scanner.nextLine().toUpperCase();

        System.out.println("insira a sua massa corporal: ");
        float massa = scanner.nextFloat();

        System.out.println("insira a sua altura: ");
        float altura = scanner.nextFloat();

        switch (sexo){
            case "M" -> System.out.printf("seu peso ideal é de %.3fKg", (72.7 * altura) - 58);
            case "F" -> System.out.printf("seu peso ideal é de %.3fKg", (62.1 * altura) - 44.7);
        }


    }
}
