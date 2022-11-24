import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Code with input
        int height = 10;
        int base = 5;
        int Area = height*base/2;
//        System.out.println(Area);

        //Taking Input from user
        System.out.println("Enter Height of the Triangle");
        int h = in.nextInt();
        System.out.println("Enter Base of the Triangle");
        int b = in.nextInt();
        int AreaTri = height*base/2;
        System.out.println(AreaTri);

    }
}
