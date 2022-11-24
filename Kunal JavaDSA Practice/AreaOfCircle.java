import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      //Code with input
        int radius = 10;
        double Area = 3.14*radius*radius;
//        System.out.println(Area);

        //Taking Input from user
        System.out.println("Enter Radius of Circle");
        int rad = in.nextInt();
        double AreaCi = 3.14*radius*radius;
        System.out.println("Area of Circle:" + AreaCi);


    }

}
