package ExerciciosFor;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int candidato1=0;
        int candidato2=0;
        int candidato3=0;
        int candidato4=0;
        int votoNulo=0;
        int VotoEmBranco=0;
        int voto;
        double total=10; 
            for(int i=1;i<=10;i++){
        System.out.println("____________________________________________________");   
        System.out.println("1, 2, 3 ou 4 - Voto para o respectivo candidato");
        System.out.println("5 - Voto nulo");
        System.out.println("6 - Voto em branco");

        System.out.print("Digite seu voto: ");
        voto = scanner.nextInt();
        System.out.println("____________________________________________________");   

             switch(voto){
            case 1: candidato1++;
                break;
            case 2: candidato2++;
                break;
            case 3: candidato3++;
                break;
            case 4: candidato4++;
                 break;
                  case 5: votoNulo++;
                break;
                 case 6: VotoEmBranco++;
                break;
            default: System.out.println("Operação Inválida");
     }
        }
        System.out.println("O candidato 1 recebeu: " + candidato1 + " votos");
        System.out.println("O candidato 2 recebeu: " + candidato2 + " votos");
        System.out.println("O candidato 3 recebeu: " + candidato3 + " votos");
        System.out.println("O candidato 4 recebeu: " + candidato4 + " votos");
        System.out.println("A quantidade de votos nulo foi de: " + votoNulo);
        System.out.println("A quantidade de votos em branco foi de: " + VotoEmBranco);
        System.out.println("A porcentagem de votos nulo foi de: " + (votoNulo*100.0)/total + "%");
         System.out.println("A porcentagem de votos em branco foi de: " +(VotoEmBranco*100.0)/total + "%");
        
    }
    
}
