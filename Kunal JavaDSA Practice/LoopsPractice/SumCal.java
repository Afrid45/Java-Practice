import java.util.Scanner;

public class SumCal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);

            if (op == '+'){
                System.out.println("Enter the first Number:");

                boolean num = in.hasNext();



//                System.out.println("Enter the second Number:");
//                int num2 = in.nextInt();
//
//                if (op == '+'){
//                    num1 = 0;
//                    ans = num1;
//                }

            }else if (op == '0'){
                break;
            }else {
                System.out.println("Invalid Operator");
            }
            System.out.print("Answer:");
            System.out.println(ans);
        }

        }
    }

