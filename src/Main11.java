import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max;
        int r;
        int i;
        int escolha;

        do {
            System.out.print("número limite do loop: ");
            max = scanner.nextInt();

            System.out.print("Insira a razão que vai variar o loop (razão = 2; 1, 3, 5...): ");
            r = scanner.nextInt();

            System.out.print("Insira o número inicial do seu loop: ");
            i = scanner.nextInt();

            System.out.print("Seu loop será 1:crescente ou 2:decrescente?(1 ou 2): ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                for (int a = i; a <= max; a += r) {
                    System.out.println(a);
                }

            } else if (escolha == 2) {
                for (int a = i; a >= max; i -= r) {
                    System.out.print(a);
                }
            } else {
                System.out.println("SUA ESCOLHA NÃO É VÁLIDA (FÍ DA PESTE)");
            }
        } while (escolha < 0 || escolha > 2);

        scanner.close();

    }
}
