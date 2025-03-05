package org.example;



// 문제 : 아래와 같이 출력해주세요.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

//        1~3까지 출력하는 작업 10번
// 조건 : 2중 while문 사용

//        int i = 1;
//        while (i <= 10){
//            System.out.println("i :"+i);
//            int j = 1;
//            while (j<=3){
//                System.out.println(j);
//                j++;
//            }
//            i++;
//        }


//        for로 풀어보기

// 조건 2중 for문 사용

//        for(int i=1;i<=10;i++){
//            for (int j=1;j<=3;j++){
//                System.out.println(j);
//            }
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



// 결과가 이렇게 나오는가?

//        int r =4;
//
//        for (int i=1;i<=r;i++){
//            for (int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
////        변수 i는 r까지 실행
////        변수 k는 i까지 실행
////        r이 4일때, i가 1번째 반복되는 동안 k도 1번 반복됨
////        i가 2번째 반복될 때 k도 2번 반복함
////        i가 4번째 반복될 때 k도 4번 반복함


        // 피라미드 만들기
//    int n =3;
//    for (int i=1;i<=n;i++){
//        for (int j=i;j<n;j++){
//            System.out.print("  ");
//        }
//        for (int k=1;k<=(2*i-1);k++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//
////    i가 1일때 안쪽 첫번째 반복문을 (n-1)만큼 >> j=1 두2칸 띄움
////    두번째 반복문을 (2*i-1) 만큼 즉, 1만큼 > 별 1개 출력
////    i가 2일때 안쪽 첫번째 반복문을 (n-1)만큼 >> j=2 1칸 띄움
////    두번째 반복문을 3만큼 > 별 3개 출력


























    }
}