import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Code with input
        int base = 10;
        int side = 20;
        int Perimeter = 2*(base+side);
//        System.out.println(Perimeter);

        //Taking Input from user
        System.out.println("Enter base of the parallelogram");
        int b = in.nextInt();
        System.out.println("Enter side of the Parallelogram");
        int s = in.nextInt();
        int PeriParallelogram = 2*(b+s);
        System.out.println(PeriParallelogram);


    }
}
