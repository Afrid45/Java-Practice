import java.util.Scanner;

public class nPrAndnCr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, r, ncr,npr, fact=1, numerator, denominator, i=1, sub;
        Scanner s = new Scanner(System.in);
        System.out.println("The program for nPr:");
        System.out.print("\nEnter the Value of n: ");
        n = in.nextInt();
        System.out.print("\nEnter the Value of r: ");
        r = in.nextInt();

        while(i<=n)
        {
            fact = fact*i;
            i++;
        }
        numerator = fact;       // n!
        sub = n-r;
        fact = 1;
        i = 1;
        while(i<=sub)
        {
            fact = fact*i;
            i++;
        }
        denominator = fact;     // (n-r)!
        fact = 1;
        i = 1;
        while(i<=r)
        {
            fact = fact*i;
            i++;
        }
        denominator = (fact*denominator);    // r!(n-r)!
        ncr = numerator/denominator;

        System.out.println("\nnCr = " +ncr);
        System.out.println("\nThe program for nPr:");
        //nPr
        System.out.print("\nEnter the Value of n: ");
        n = in.nextInt();
        System.out.print("\nEnter the Value of r: ");
        r = in.nextInt();


        while(i<=n)
        {
            fact = fact*i;
            i++;
        }
        numerator = fact;       // n!
        sub = n-r;
        fact = 1;
        i = 1;
        while(i<=sub)
        {
            fact = fact*i;
            i++;
        }
        denominator = fact;     // (n-r)!
        fact = 1;
        i = 1;
        while(i<=r)
        {
            fact = fact*i;
            i++;
        }
        npr = numerator/denominator;

        System.out.println("\nnPr = " +npr);

    }
}
