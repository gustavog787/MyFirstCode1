import java.util.Scanner;

public class Main4  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;

        double price;
        int quantity;
        char currency = '$';
        double total;

        String item2;
        double price2;
        int quantity2;
        double total2;


        System.out.print("what item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is price for each: ");
        price = scanner.nextDouble();

        System.out.print("what is quantity would you like: ");
        quantity = scanner.nextInt();

        if(quantity > 1);{
            item += "/s";
        }
        System.out.println("you have bought " + quantity + " " + item);

        System.out.println("Your total is: " + currency + price * quantity);


        System.out.print("what item would you like to buy?: ");
        item2 = scanner.next();

        System.out.print("What is price for each: ");
        price2 = scanner.nextDouble();

        System.out.print("what is quantity would you like: ");
        quantity2 = scanner.nextInt();
        if(quantity2 > 1);{
            item2 += "/s";
        }


        System.out.println("you have bought " + quantity2 + " " + item2);
        System.out.println("Your total is: " + currency + price2 * quantity2);

        scanner.close();

    }
}
