package ExerciciosFor;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int velinho=0;
        int jovem = 0;
        int pena =0;
        float altura2;
        float media = 0;
        float total = 10;
       
        for(int i=1; i<=10; i++){
        System.out.print("insira a sua idade: ");
        int idade = scanner.nextInt();

        if(idade >50){
            System.out.print("Insira a sua altura: ");
        float altura= scanner.nextFloat();
            velinho++;
            
        } 
        else if(idade >=10 && idade<=20){
            System.out.println("Insira a sua altura: ");
            altura2=scanner.nextFloat();
            jovem++; 
            media = jovem/altura2;
        }
        System.out.println("Insira o seu peso: ");
        float peso=scanner.nextFloat();
        if(peso<40){
            pena++;
        }
    }
    System.out.println("A quantidade de pessoas maiores de 50 anos é de : " + velinho + " pessoas");
    System.out.println("A média de altura das pessoas entre 10 e 20 anos é de: " + media);
    System.out.println("A quantidade de pessoas com menos de 40Kg é de: " + pena*100/total + "%");
}
}