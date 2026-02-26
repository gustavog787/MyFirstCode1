import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double unnewWeight;
       double weight;
       double newWeight;
       int choice;

        System.out.println("Weight conversion Program");

        System.out.println("1: convert lbs to kgs");

        System.out.println("2: convert kgs to lbs");

        System.out.println("Chose option (1 or 2): ");
        choice = scanner.nextInt();
        System.out.println(choice);

        if(choice == 1){
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462262185;
            System.out.print(" The weight in lbs is: " + newWeight);
        }
        else{
            System.out.print("Enter weight in lbs: ");
            unnewWeight = scanner.nextDouble();
            Double peso = unnewWeight / 2.20462262185;
            System.out.print(" The weight in kgs is: " +  peso );
        }




        scanner.close();
    }
}
