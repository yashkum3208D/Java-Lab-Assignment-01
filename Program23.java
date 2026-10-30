
import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();

        float fahrenheit = (float) ((celsius * 9.0 / 5.0) + 32);

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
