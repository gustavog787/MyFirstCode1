package ExerciciosIfElse;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        System.out.println("Insira sua senha: ");
        senha = scanner.nextLine();
        if(senha.equals("R10p5")){
            System.out.println("senha correta");
        }else{
            System.out.println("SENHA INCORRETA");
            
            System.out.println("TENTE NOVAMENTE");
        }
   

    }
}
