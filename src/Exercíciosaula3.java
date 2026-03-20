import java.util.Scanner;

public class Exercíciosaula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        do {
            System.out.println("insira um número entre 50 e 100: ");
            num = scanner.nextInt();

            if (num > 50 && num < 100) {
                System.out.println("Está dentro do intervalo");
            }else{
                System.out.println("Não está dentro do intervalo");
                System.out.println("TENTE NOVAMENTE");
            }
        }while(num <= 50 || num >=100);

        System.out.println("Até que você sabe ler");
        scanner.close();
        }

    }
