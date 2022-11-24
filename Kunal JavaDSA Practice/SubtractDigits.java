import java.util.Scanner;

public class SubtractDigits {

    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Digit:");
        int n= in.nextInt();
        int sum = 0;
        int product = 1;

        while(n>0){
            int value = n % 10;
            sum = value + sum;
            product = value*product;
            n = n/10;

        }
        System.out.println("Sum is =" + sum);
        System.out.println("Product is =" + product);
        n = sum - product;
        System.out.println("Subtract of Product and Sum of the digit =" + n);

        }
    }

