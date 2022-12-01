package com.afrid.PW.Practice;

public class FactorialNum {
    public static void main(String[] args) {
        factNum(5);

    }
    static void factNum(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
