import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int posição =1;
        int min=0;


        while(posição <=10){
            System.out.print("insira um número inteiro positivo: ");
            num= scanner.nextInt();

            if(posição ==1){
                min=num;
            }else if(num<min){
                min=num;
            }
            if(num<0){
                System.out.println("SIGA AS INSTRUÇÕES");
                System.exit(0);
            }
            posição++;
        }
        System.out.println("O menor número entre eles é: " + min);

        scanner.close();

    }
}
