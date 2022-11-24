import java.util.Scanner;

public class SumCal2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int counter = 0;

        int sum = 0;
        int input = 0;

        System.out.println("Enter the numbers for Sum Operation: ");
        while ((input = in.nextInt()) != 0 ){

            if (input != 0){
                sum = input + sum;
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(sum);


        }
//        else {
//            System.out.println("Data Incorrect");
//
//        }
    }
}

