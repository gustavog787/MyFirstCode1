import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resp = 1;

        System.out.print("Insira o primeiro número (inteiro) da sequência: ");
        int num= scanner.nextInt();
        scanner.nextLine();

        System.out.print("Insira a razão que deseja na sequência: ");
        int razão= scanner.nextInt();
        while(resp<=10){
            System.out.print(num);
            if(resp<10){
                System.out.print(", ");
            }
            num=num*razão;
            resp++;
        }



    scanner.close();
    }
}
