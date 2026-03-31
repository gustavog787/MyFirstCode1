import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int num;
        int pares = 0;
        int impares = 0;
        while(contador <=10){
            System.out.println("digite o " + contador + "º número inteiro: ");
            num=scanner.nextInt();
            scanner.nextLine();
            contador++;

        if(num%2==0){
            pares++;
        }else {
            impares++;
        }
        }
        System.out.println("O total de números pares é de: " + pares);
        System.out.println("O total de números impares é de: " + impares);

        scanner.close();
    }
}
