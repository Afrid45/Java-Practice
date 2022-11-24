import java.util.Scanner;

public class BattingAvg {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
                int innings;
                int runs;
                int notout;
                int avg;

            System.out.println("enter the number of matches played");

                int Matches= in.nextInt();

            while(true)
            {
                System.out.println("enter the number innings batted");

                innings = in.nextInt();


                if(innings<=Matches)
                    break;

                System.out.println("enter the number innings batted correctly <=matches");

            }


            while(true)
            {

                System.out.println("enter number of times notout");

                notout = in.nextInt();


                if(notout<=innings)
                    break;

                System.out.println("enter the number times became notout correctly <=innings");
            }

            System.out.println("enter runs scored");

            runs = in.nextInt();




            if(innings==notout)
                avg=runs;
            else
                avg=runs/(innings-notout);

            System.out.println("batting average="+avg);

        }

    }



