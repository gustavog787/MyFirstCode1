package ExerciciosFor;

import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int velinho=0;
       
        for(int i=1; i<=10; i++){
        System.out.println("insira a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Insira a sua altura: ");
        float altura= scanner.nextFloat();

        if(idade >50){
            velinho++;
        } 
        float media=altura*velinho;
         System.out.println("a média das alturas das pessoas maiores de 50 anos é de: " + media);
        }
    }
    
}
