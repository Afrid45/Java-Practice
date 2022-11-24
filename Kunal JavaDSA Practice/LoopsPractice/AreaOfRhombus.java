import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Code with input
        int diagonal1 = 10;
        int diagonal2 = 5;
        int Area = diagonal1 * diagonal2 / 2;
//        System.out.println(Area);

        //Taking Input from user
        System.out.println("Enter length of vertical diagonal ");
        int Vdiag = in.nextInt();
        System.out.println("Enter Length of horizontal diagonal");
        int Hdiag = in.nextInt();
        int AreaRhom = Vdiag * Hdiag / 2;
        System.out.println(AreaRhom);
    }
}