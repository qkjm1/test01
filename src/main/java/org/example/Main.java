package org.example;



// 문제 : 아래와 같이 출력해주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

//        1~3까지 출력하는 작업 10번
// 조건 : 2중 while문 사용

        int i = 1;
        int j = 1;
        while (i <= 10){
            while (j<=3){
                System.out.println(j);
                j++;
            }
            System.out.println();
            i++;
            j = 1;   // j값을 초기화하지 않으면 4라는 값이 되므로 반복불가
        }

//        for로 풀어보기

// 조건 2중 for문 사용

//        for(int i=1;i<=10;i++){
//            for (int j=1;j<=3;j++){
//                System.out.println(j);
//            }
//            int j =0;
//            System.out.println();
//        }


// -100부터 25까지 출력
//        for (int i =-100;i<=25;i++){
//            System.out.println(i);
//        }


//        -1부터 5까지의 합을 출력
//        int a=0;
//        for (int i =-1;i<=5;i++){
//            a += i;
//        }
//        System.out.println(a);


//        -100부터 25까지의 합을 출력
//        int a=0;
//        for (int i= -100;i<=25;i++){
//            a += i;
//        }
//        System.out.println(a);


//직사각형 별찍기
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        for (int j=0;j<b;j++) {
//            for (int i=0; i < a; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



































    }
}