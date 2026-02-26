import java.util.Scanner;

public class Main14 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance=0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            System.out.println("*****************");
            System.out.println("Programa Bancário");
            System.out.println("*****************");
            System.out.println("1. consultar saldo");
            System.out.println("2. depositar");
            System.out.println("3. sacar");
            System.out.println("4. sair");
            System.out.println("*****************");

            System.out.print("Insira a sua escolha (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= Withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("SUA ESCOLHA NÃO É VÁLIDA");

            }

        }
        System.out.println("*****************************");
        System.out.println("OBRIGADO! TENHA UM ÓTIMO DIA!");
        System.out.println("*****************************");

    }
    static void showBalance(double balance){
        System.out.println("*****************");
        System.out.printf("R$%.2f\n", balance);
    }
    static double deposit(){

        double amount;
        System.out.print("Insira a quantidade que deseja depositar: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Não há meios de depositar quantias negativas".toUpperCase());
        return 0;
        }
            else{
                return amount;

        }



    }
    static double Withdraw(double balance){

        double amount;

        System.out.print("Insira a quantidade que deseja sacar: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("VOCÊ NÃO POSSUI ESSA QUANTIDADE NA SUA CONTA");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("NÃO É POSSÍVEL RETIRAR QUANTIAS NEGATIVAS");
            return 0;
        }
        else {
            return amount;
        }
    }
}
