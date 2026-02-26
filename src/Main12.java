import java.util.Scanner;
import java.util.Random;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int linhas;
        int colunas;


        System.out.println("Insira o número de linhas: ");
        linhas = scanner.nextInt();

        System.out.println("Insira o número de colunas: ");
        colunas = scanner.nextInt();

        int [][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
               matriz[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.print(matriz[i][j] + " ");;
            }
            System.out.println();

        }
        scanner.close();
    }
}