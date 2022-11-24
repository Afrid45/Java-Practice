import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Code with input
        int radius = 10;
        double Perimeter = 2*3.14*radius;
//        System.out.println(Perimeter);

        //Taking Input from user
        System.out.println("Enter Radius of Circle");
        int rad = in.nextInt();
        double PeriCircle = 2*3.14*radius;
        System.out.println(PeriCircle);


    }
}
