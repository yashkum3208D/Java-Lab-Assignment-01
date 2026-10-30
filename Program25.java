
import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (0 or 1): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (0 or 1): ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (&, |, !): ");
        char op = sc.next().charAt(0);

        if ((a == 0 || a == 1) && (b == 0 || b == 1)) {

            if (op == '&') {
                System.out.println("Result: " + ((a == 1) && (b == 1)));
            } else if (op == '|') {
                System.out.println("Result: " + ((a == 1) || (b == 1)));
            } else if (op == '!') {
                System.out.println("NOT First Number: " + (a == 0));
                System.out.println("NOT Second Number: " + (b == 0));
            } else {
                System.out.println("Invalid Operator");
            }

        } else {
            System.out.println("Please enter only 0 or 1");
        }

        sc.close();
    }
}
