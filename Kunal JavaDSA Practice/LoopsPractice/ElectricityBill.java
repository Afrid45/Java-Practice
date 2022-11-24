import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the units :");
        int units = in.nextInt();

        if (units <= 100){
            
            int bill = 10*units;
            System.out.println("The Electricity bill for the given units is: " + bill);
            


        } else if (units <= 200) {
            int bill = 100*10+(units-100)*15;

            System.out.println("The Electricity bill for the given units is: " + bill);
            
            
        } else if (units <= 300 ) {

            int bill = (100*10) + (100 * 15) +(units - 200)*20;

            System.out.println("The Electricity bill for the given units is: " + bill);
            
        } else if (units > 300) {

            int bill = (100*10) + (100 * 15) + (100 * 200) + (units - 300)* 25;

            System.out.println("The Electricity bill for the given units is: " + bill);



        }
    }
}
