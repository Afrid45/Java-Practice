import java.util.Scanner;

public class AverageOfNums {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Total count of number to find the average of: ");
        int n = in.nextInt();

        int sum = 0;
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {

            sum = sum + in.nextInt();

        }

        int avg = sum/n;
        System.out.println("Average of n given numbers is:  "+ avg);


    }

 }


