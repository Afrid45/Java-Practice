import java.util.Scanner;

public class AreaOfEquilateralTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Code with input
        int sideLen = 10;

        double AreaET = Math.sqrt(3)/4*sideLen*sideLen;
//        System.out.println(AreaET);

//        Taking Input from user
        System.out.println("Enter Length of the side of the triangle:");
        int SideLen = in.nextInt();

        double Area = Math.sqrt(3)/4*SideLen*SideLen;
        System.out.println(Area);
    }
}