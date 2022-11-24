import java.util.Scanner;

public class DiscountProg {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price: ");

        int price = in.nextInt();
        System.out.println("Enter the discount: ");
        int discount = in.nextInt();

        int discPrice = price*discount/100;
                System.out.println("The discounted price of the product:" + discPrice);


    }
}


