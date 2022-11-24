import java.util.Scanner;

public class FactorOfNums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.print("Factors of the number are : ");
        for (int i = 1; i < n ; i++) {

            if ( n % i == 0){

                System.out.print(i + " ");
            }

        }
    }
}