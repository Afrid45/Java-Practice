import java.util.Scanner;

public class FactorialProg {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= number ; i++) {

            fact = fact*i;


        }

        System.out.println("Factorial of Number " + number + " is:" + fact);
        
    }


}
