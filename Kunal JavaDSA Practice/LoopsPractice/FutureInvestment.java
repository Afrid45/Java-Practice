import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter present value: ");
        double p = in.nextInt();

        System.out.print("Enter the interest rate: ");
        double r = in.nextInt();

        System.out.print("Enter the time period in years: ");
        double y = in.nextInt();

        double f = p * Math.pow((1 + r / 100), y);
        System.out.print("value is: " + f);
    }
}

