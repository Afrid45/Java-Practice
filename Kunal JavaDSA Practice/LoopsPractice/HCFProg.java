import java.util.Scanner;

public class HCFProg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, i, hcf = 0;
        System.out.println("Enter first number :: ");
        a = in.nextInt();
        System.out.println("Enter second number :: ");
        b = in.nextInt();

        for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                hcf = i;
        }
        System.out.println("HCF of given two numbers is ::"+hcf);
    }
}
