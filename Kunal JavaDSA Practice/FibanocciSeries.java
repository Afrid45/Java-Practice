import java.util.Scanner;

public class FibanocciSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println("Enter the count:");
        int count = in.nextInt();
        System.out.print(n1 + " "+ n2);

        for (int i = 2; i < count ; i++) {

            n3 = n1+n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;


        }
    }
}
