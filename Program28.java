
import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            if (num < 0) {
                num = -num;
            }

            while (num > 0) {
                count++;
                num = num / 10;
            }
        }

        System.out.println("Number of Digits: " + count);

        sc.close();
    }
}
