package ExerciciosIfElse;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if (idade >= 18 && idade <= 70) {
                   

        System.out.print("Seu título de eleitor está regular? (S/N): ");
        String titulo = scanner.nextLine().toUpperCase();

        switch(titulo){
            case "S":
                System.out.println("Ótimo");
                break;
                case "N":
                    System.out.println("Você não está apto para votar");
                    System.out.println("REGULARIZE O SEU TÍTULO DE ELEITOR");
                    System.exit(0);
                    break;
        }

        System.out.print("Você é alfabetizado? (S/N): ");
        String alfabetizado = scanner.nextLine().toUpperCase();

        switch(alfabetizado){
            case "S":
                System.out.println("Ótimo");
                 System.out.println("Voto obrigatório");
                break;
                case "N":
                    System.out.println("Voto facultativo");
                     System.exit(0);
                    break;
                    
        }


        }
        else if (idade < 16) {
            System.out.println("Não pode votar.");
        } else {
                    System.out.println("Apto a votar (voto facultativo)."); 
    
                }
                
                
                scanner.close();
            }
        }

