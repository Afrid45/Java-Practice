public class VolumeOfPrism {
    public static void main(String[] args) {

        int sidelengthA = 10;
        int sidelengthB = 20;
        int sidelengthC = 20;
        int height = 40;

        double i = Math.sqrt(sidelengthA+sidelengthB+sidelengthC);
        double j = Math.sqrt(sidelengthB+sidelengthC-sidelengthA);
        double k = Math.sqrt(sidelengthC+sidelengthA-sidelengthB);
        double l = Math.sqrt(sidelengthA+sidelengthB-sidelengthC);

        double volume = 0.25*height*i*j*k*l;
        System.out.print("Volume of the Triangle Prism: " + volume);
    }
}
