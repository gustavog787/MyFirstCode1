import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1;
        float nota2;
        int posição=1;
        int aluno=1;

        while(posição <=10){

            do{
            System.out.print("insira sua primeira nota aluno " + aluno + ": ");
            nota1= scanner.nextInt();
            System.out.print("insira sua segunda nota aluno " + aluno + ": ");
            nota2= scanner.nextInt();
            aluno++;


            float media=(nota1+nota2)/2;

            if(nota1 <0 || nota1 >10 || nota2 <0 || nota2 >10) {
                System.out.println("Nota inválida");
                System.out.println("TENTE NOVAMENTE");
                aluno--;
            }else{
                System.out.println("sua média é de: " + media);
            }

            }while(nota1 <0 || nota1 >10 || nota2<0 || nota2>10);

            }
            posição++;

        scanner.close();

    }
}
