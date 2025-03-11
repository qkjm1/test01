package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean result = Math.isPrimeNumber(1);
        System.out.println("1은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(2);
        System.out.println("2은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(3);
        System.out.println("3은(는) 소수인가? : " + result);

        result = Math.isPrimeNumber(4);
        System.out.println("4은(는) 소수인가? : " + result);

//        int rs = one_to_n_prime_numbers_count(10);
//        System.out.println("rs : " + rs);
//        // rs : 4
//        rs = one_to_n_prime_numbers_count(13);
//        System.out.println("rs : " + rs);
//        // rs :  6
//    }
//    public static int one_to_n_prime_numbers_count(){
//        int g = 0;
//        for(int i=0;;){
//            if (){
//
//            }
//        }

        boolean rs = Math.IsevenNumber(3);
        System.out.println(rs);
    }
}

class Math {
    public static boolean IsevenNumber(int k) {
        return  k % 2 == 0;
    }
    public static boolean isPrimeNumber(int a){
        return a%2==0;

    }

}




