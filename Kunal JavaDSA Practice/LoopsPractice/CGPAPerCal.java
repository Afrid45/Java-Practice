import java.util.Scanner;

public class CGPAPerCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double English, Hindi, Maths, Science, SocialStudy, CGPA, CGPAper ;
        System.out.println("Enter English Grade: ");
        English = in.nextDouble();

        System.out.println("Enter Hindi Grade: ");
        Hindi = in.nextDouble();

        System.out.println("Enter Maths Grade: ");
        Maths = in.nextDouble();

        System.out.println("Enter Science Grade: ");
        Science =in.nextDouble();

        System.out.println("Enter Social Studies Grade: ");
        SocialStudy = in.nextDouble();

        CGPA = (English+Hindi+Maths+Science+SocialStudy)/(5.0);
                CGPAper = (float)(9.5 * (CGPA));
                System.out.println(" CGPA Percentage is:  "+CGPAper);
    }
}
