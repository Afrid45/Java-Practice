import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x;
        int number;
        int y = 0;
        int temp = 0;

        System.out.println("Enter any number: ");
        number = in.nextInt();
        x = number;
        while (number > 0) {
            x = number % 10;
            number = number / 10;
            temp = temp * 10 + x;
        }
        if (temp == y) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
