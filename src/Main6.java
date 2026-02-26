import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;


        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the Interested rate (in %): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the # of times compound per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1+rate/100), years);

        System.out.printf("The amount after %d year is R$%f",years,amount);

        //Inter: R$1192,00
        //PagBank: R$1937,00


        scanner.close();
    }
}