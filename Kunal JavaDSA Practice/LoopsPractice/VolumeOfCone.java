import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int heightOfCone = 20;
        int radiusOfCone = 10;
        double volume = 3.14*radiusOfCone*radiusOfCone*heightOfCone/3;
        System.out.println(volume);
    }
}
