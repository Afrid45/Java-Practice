package com.afrid.PW.Practice;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

//        pattern1(); //Rectangular pattern
//        pattern2(); //Hollow Rectangular Pattern
//        pattern3(); //Triangular Pattern
//        pattern4(); //Inverted Triangular Pattern
//        pattern5(); //Pyramid Pattern
//        pattern6(); //Numerical Rectangular Pattern(This pattern6 is incorrect! Should modify it later)
//        pattern7(); //Numerical Rectangular Pattern
//        pattern8(); //Numerical Rectangular Pattern
//        pattern9(); //Numerical Triangle pattern
//        pattern10();//Numerical Pyramid pattern
    }

    static void pattern1() {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c  ; j++) {
                if (i == 1 || i == r || j == 1 || j == c )
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pattern3(){
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
    static void pattern4(){
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
//        int c = in.nextInt();

        for (int i = 1 ; i <= r ; i++) {
            for (int j = 1; j <= r + 1 - i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    static void pattern5(){
        Scanner  in = new Scanner(System.in);
        int r = in.nextInt();

        for (int i = 1; i <= r ; i++) {

            for (int j = 1; j <= r - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(){

//        This pattern is incorrect! Should modify it later
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
//        int c = in.nextInt();

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= r ; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i - 1 ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    static void pattern7(){
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void pattern8(){
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c ; j++) {
                if ((i + j) % 2 == 0){
                    System.out.print(1);
                }else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }


    }
    static void pattern9(){
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void pattern10(){
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        for (int i = 1; i <= r ; i++) {
//            for spaces
            for (int j = 1; j < r - i; j++) {
                System.out.print(" ");

            }
//            for printing 1 to i
            for (int k = 1; k <= i ; k++) {
                System.out.print(k);
                }
            for (int l = i - 1; l >= 1 ; l--) {
                System.out.print(l);

            }
            System.out.println();

        }
    }

}