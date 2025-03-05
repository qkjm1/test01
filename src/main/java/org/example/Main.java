package org.example;



// 문제 : 아래와 같이 출력해주세요.

class Main {
    public static void main(String[] args) {

// 문제 : 1부터 5까지 출력해주세요.

//        int i = 1;
//
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//        }

/// /////


// 문제 : -100부터 25까지 출력해주세요.

//        int i = -100;
//
//        while (i <= 25){
//            System.out.println(i);
//            i++;
//        }

////////

// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용

//        int i = 1;
//        int j = 1;
//        while (i <= 3){
//            while (j<=3){
//                System.out.println(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//            j = 1;   // j값을 초기화하지 않으면 4라는 값이 되므로 반복불가
//        }

/// ///////

// -100부터 25까지의 합을 출력하세요.
//        int i = -100;
//        int j = 0;
//
//        while (i <= 25){
//            j+=i;
//            i++;
//        }
//        System.out.println(j);


/// /////

//         소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

//    int[] arry1={2,3,4,5};
//    int a=0;
//    for (int i=0;i< arry1.length;i++){
//        a += arry1[i];
//    }
//        System.out.println(a);
//        System.out.println("++"+(double)a/arry1.length);
//
//        if ((double)a%0.5 == 0){
//
//            System.out.println((double)a/arry1.length);
//        }



        int angle=180;
        int a =0;

        if(angle<90){
            a = 1;
        }else if(angle==90){
            a = 2;
        }else if (angle<180){
            a = 3;
        }else {a= 4;}

        System.out.println(a);




    }
}