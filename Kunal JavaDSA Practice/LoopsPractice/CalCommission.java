import java.util.Scanner;

public class CalCommission {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount:");

        double amount=in.nextDouble();

        System.out.print("Enter commissionPercentage:");

        double commissionPercentage=in.nextDouble();

        double commission=(commissionPercentage/100)*amount;

        System.out.println("Commission amount="+commission);
    }
}
