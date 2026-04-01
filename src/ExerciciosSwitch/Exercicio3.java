package ExerciciosSwitch;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Períodos de estudo:");
        System.out.println("Matutino (M)");
        System.out.println("Vespertino (V)");
        System.out.println("Noturno (N)");
        System.out.print("Em que periodo que você estuda: ");
        String periodo = scanner.nextLine().toUpperCase();

        switch(periodo){
            case "M": System.out.println("BOM DIA!");
            break;
            case "V": System.out.println("BOA TARDE!");
            break;
            case "N": System.out.println("BOA NOITE!");
            break;
        }

    }
    
}
