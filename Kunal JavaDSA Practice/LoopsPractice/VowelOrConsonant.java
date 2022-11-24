import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
