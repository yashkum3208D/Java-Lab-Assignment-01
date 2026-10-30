
import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if (cp < 0 || sp < 0) {
            System.out.println("Invalid Price");
        } else if (sp > cp) {
            double profit = sp - cp;
            System.out.println("Profit: " + profit);
        } else if (cp > sp) {
            double loss = cp - sp;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}
