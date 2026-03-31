import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int posição=1;
        float altura;
        float massa;
        int saudavel=0;

        while(posição <=10) {
            System.out.print("insira sua altura: ");
            altura= scanner.nextFloat();

            System.out.println("insira o seu peso: ");
            massa= scanner.nextFloat();

            float imc= massa/(altura * altura);

            System.out.println("Seu IMC é de: " +  imc);

            if(imc>=18.5 && imc<=24.9){
                saudavel++;
            }
            posição++;
        }
        System.out.println("A quantidade de pessoas saudáveis é de " + saudavel);

        scanner.close();
    }
}
