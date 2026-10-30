
import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                System.out.println("Character is Vowel");
            } else {
                System.out.println("Character is Consonant");
            }

        } else {
            System.out.println("Invalid character");
        }

        sc.close();
    }
}
