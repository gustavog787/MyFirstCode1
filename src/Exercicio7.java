import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o seu salário antes do reajuste: R$");
        float salariobf = scanner.nextFloat();

        System.out.print("Insira o número de anos que você está na empresa: ");
        int anos = scanner.nextInt();

        if(anos >= 5){
            System.out.println("Seu salário após o bônus é de: R$" + salariobf * 1.20);
        }else{
            System.out.println("Seu salário após o bônus é de: R$" + salariobf * 1.10);

            scanner.close();
        }
    }
}
