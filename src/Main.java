import java.util.Scanner;

public class Main {

public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("enter your age: ");
    int age = scanner.nextInt();




    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old");
    System.out.print("How do you want: ");
    String want = scanner.next();

    System.out.println("I can give you " + want + " for ever");
    System.out.println("But you need answer a question ");
    System.out.print(" Do you give me your soul for this? (true/false): ");
    boolean forThis = scanner.nextBoolean();

    if (forThis) {
        System.out.println("you are brave");
    }
    else{
        System.out.println("you are chicken");
    }
}

}
