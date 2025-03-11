package org.example;

//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(7);
        System.out.println("7은(는) 소수인가? : " + result);

        int rs = one_to_n_prime_numbers_count(10);
        System.out.println("rs : " + rs);
        // rs : 4
        rs = one_to_n_prime_numbers_count(13);
        System.out.println("rs : " + rs);
        // rs :  6

        boolean rs1 = Math.IsevenNumber(8);
        System.out.println("짝수인가 :"+rs1);
    }


    public static int one_to_n_prime_numbers_count(int c){
        int g = 0;
        for (int m=1;m<c;m++){
            for (int i=2;i<=c;i++){
                if(c%2==1){
                    g += 1;
                }
                if (c==2){
                    g=1;
                    break;
                }
            }
        }
        return g;

    }

}

class Math {
    public static boolean IsevenNumber(int k) {
        return  k % 2 == 0;
    }
    public static boolean isPrimeNumber(int a){
        for (int i=2;i<=a;i++){
             if(a%2==1||a==2){
                return true;
            }
        }

        return false;

    }

}




