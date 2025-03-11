package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            계산기.합(10,20);
            계산기.뺌(50,20);

    }
}
class 계산기{
    static void 합(int x, int y){
        System.out.println(x+y);
    }
    static void 뺌(int x, int y){
        System.out.println(x-y);
    }
}


////        사람.말하다();
//        계산기.합();
//        계산기.합();
//        계산기.합();
//
//
//    }
//}
////class  사람{
////    static void 말하다(){
////        System.out.println("사람이 말합니다.");
////    }
////
////}
//
//
//class 계산기{
//    static void 합(){
//    int a= 20;
//    int b= 10;
//
//        System.out.println(a+b);
//    }
//}


//            String msg = greet("Jin");
//            System.out.println(msg);
//// msg라는 이름을 가진 변수는 greet라는 string 타입의 객체를 갖는다.
////         거기엔 gin이라는 매개변수를 가짐
//
//            Point point = createPoint(5, 10);
//            System.out.println("Point create at (" + point.x + ", " + point.y + ")");
////point 타입의 변수는 createpoint라는 객체를 가짐여기서 매개변수는 x는 5 y는 10
//
//            int[] evens = firstNEvenNumbers(5);
//            System.out.println("first 5 even numbers : " + Arrays.toString(evens));
//        }
////        Arrays.toString 배열을 문자열로 나열 매개변수가 5이므로 아래 배열 메서드에 적용됨
//    // [2,4,6,8,10]이 출력
//
//        public static String greet(String name) {
//            return "Hello, " + name + "!";
//        }
////String 타입으로 받아 리턴한다. 매개변수는 string 위에서 이름이 적히면 리턴됨
//
//        public static Point createPoint(int x, int y) {
//            return new Point(x, y);
//        }
////point 매개변수는 x, y 메인클래스에서
//        public static int[] firstNEvenNumbers(int n) {
//            int[] evenNumbers = new int[n];
//
//            for (int i = 0, num = 2; i < n; i++, num += 2) {
//                evenNumbers[i] = num;
//            }
//            return evenNumbers;
//        }// 위에서 넣어준 매개변수로 n에 5값이 들어감 반복문에서 num은 2씩 증가하면서 배열에 넣어지므로
//    // 2,4,6,8,10 이 들어감
//    }

