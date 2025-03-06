package org.example;



// 문제 : 아래와 같이 출력해주세요.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x;
        char y;

        x = sc.next().charAt(0);
        y = sc.next().charAt(0);

        System.out.printf("%c %c",y,x);

    }
}

//class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello");
//
//    }
//