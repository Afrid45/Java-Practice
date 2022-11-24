import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double principle, rate, time, compound_interest;

        System.out.print("Enter a Principle number : ");
        principle = in.nextInt();
        System.out.print("Enter Interest rate : ");
        rate = in.nextInt();
        System.out.print("Enter a Time period in years : ");
        time = in.nextInt();
        compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
        System.out.println("The Compound Interest is : " + compound_interest);
    }
}
