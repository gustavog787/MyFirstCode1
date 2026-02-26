import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double celsius;
        double firenhite;
        String C = "C";
        String F = "F;";
        String escolha;


        System.out.print("Insira a temperatura: ");
        temperatura = scanner.nextDouble();

        System.out.print("Converter em Fahrenheit ou Celcius? (C ou F): ");
        escolha = scanner.next();

        Double resultado = temperatura * 1.8 + 32;

        double novoResultado = (temperatura - 32) / 1.8;

        switch(C){
            case "C" -> System.out.println(novoResultado + "°C");
            case "c" -> System.out.println(novoResultado + "°C");

        }

        switch (F){
            case "F" -> System.out.print(resultado + "°F");
            case "f" -> System.out.print(resultado + "°F");
        }

        scanner.close();
    }
}
