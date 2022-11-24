import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Code with input
        int width = 10;
        int length = 5;
        int Area = width*length;
//        System.out.println(Area);

        //Taking Input from user
        System.out.println("Enter Width of the Rectangle");
        int w = in.nextInt();
        System.out.println("Enter Length of the Rectangle");
        int l = in.nextInt();
        int AreaRec = w*l;
        System.out.println(AreaRec);
    }
}
