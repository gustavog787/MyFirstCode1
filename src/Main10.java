import java.util.Random;
import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       int guess;
        int min = 1;
       int max = 100;
       int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessimg Gamer");
        System.out.printf("Guess a number between %d-%d: \n", min, max);


        do{
            System.out.print("Enter a Guess: ");
            guess = scanner.nextInt();

            if(guess < randomNumber){
                System.out.println("TOO LOW!! TRY AGAIN!");
            } else if (guess > randomNumber){
                System.out.println("TOO HIGH!! TRY AGAIN!");

            }

        }while(guess != randomNumber);

        System.out.println("You have won");


        scanner.close();
    }
}
