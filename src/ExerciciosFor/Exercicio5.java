package ExerciciosFor;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int reprovado=0;
    int exame=0;
    int aprovado=0;

for(int i =1; i<=6;i++){
    System.out.print("insira sua nota 1: ");
    float nota1 = scanner.nextFloat();
    System.out.print("insira sua nota 2: ");
    float nota2=scanner.nextFloat();

    float media=(nota1+nota2)/2;
    System.out.println("Sua média é de: " + media);

    

    if(media<=3){
        System.out.println("Você está REPROVADO");
        reprovado++;
    }else if(media>3 && media<7){
        System.out.println("Você está qualificado para fazer o EXAME");
        exame++;
    }else if(media>=7){
        System.out.println("Você está APROVADO: ");
        aprovado++;
    }
     if(nota1 <0 || nota1 >10 || nota2 <0 || nota2 >10) {
                System.out.println("Nota inválida");
                System.out.println("TENTE NOVAMENTE");
                System.exit(0);
     
}
}
System.out.println("A quantidade de alunos Aprovados é de: " + aprovado);
System.out.println("A quantidade de alunos qualificados para o Exame é de: " + exame);
System.out.println("A quantidade de alunos Reprovados é de: " + reprovado);
    }
    }
