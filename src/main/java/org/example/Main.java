package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        사람.말하다();
        계산기.합();
        계산기.합();
        계산기.합();


    }
}
//class  사람{
//    static void 말하다(){
//        System.out.println("사람이 말합니다.");
//    }
//
//}


class 계산기{
    static void 합(){
    int a= 20;
    int b= 10;

        System.out.println(a+b);
    }
}


//            String msg = greet("Jin");
//            System.out.println(msg);
//
//            Point point = createPoint(5, 10);
//            System.out.println("Point create at (" + point.x + ", " + point.y + ")");
//
//            int[] evens = firstNEvenNumbers(5);
//            System.out.println("first 5 even numbers : " + Arrays.toString(evens));
//        }//Arrays.toString 배열을 문자열로 나열
//
//        public static String greet(String name) {
//            return "Hello, " + name + "!";
//        }
//
//        public static Point createPoint(int x, int y) {
//            return new Point(x, y);
//        }
//
//        public static int[] firstNEvenNumbers(int n) {
//            int[] evenNumbers = new int[n];
//
//            for (int i = 0, num = 2; i < n; i++, num += 2) {
//                evenNumbers[i] = num;
//            }
//            return evenNumbers;
//        }
//    }

