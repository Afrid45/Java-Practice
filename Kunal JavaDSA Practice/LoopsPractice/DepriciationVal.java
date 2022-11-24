import java.util.Scanner;

public class DepriciationVal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = in.nextInt();
        System.out.println("Enter the Depriciation percent : ");
        int deppercent = in.nextInt() ;
        System.out.println("Enter the Year: ");
        int year = in.nextInt();
        int temp = amount;
        for(int i=0;i<year;i++)
            temp=((100-deppercent)*temp)/100;
        System.out.println("after depreciation = "+temp);




    }
}
