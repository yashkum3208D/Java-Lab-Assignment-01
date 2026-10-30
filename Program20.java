
import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {

            if (age >= 21) {
                System.out.println("Eligible for Marriage");
            } else {
                System.out.println("Not Eligible for Marriage");
            }

        } else if (gender == 'F' || gender == 'f') {

            if (age >= 18) {
                System.out.println("Eligible for Marriage");
            } else {
                System.out.println("Not Eligible for Marriage");
            }

        } else {
            System.out.println("Invalid Gender");
        }

        sc.close();
    }
}
