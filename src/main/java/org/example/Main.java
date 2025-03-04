package org.example;


public class Main {
    public static void main(String[] args) {
//        int[] array = new int[100];
//        // array에 순서대로 1부터 100까지 정수를 넣어보세요.
//            for (int i=0;i<array.length;i++){
//                array[i]=i+1;
//            }
//
//        System.out.println(array[56]);
//        // 아래는 결과 평가를 위한 코드입니다. 수정하지 마세요.

//        int[] array = new int[10];
//        for (int i=0;i<array.length;i++){
//            array[i] = 2 * i;
//        }
//
//        System.out.println(array[1]);

        int sum = 0;

        int[] array = new int[] {1,2,3,4,5};

        for (int i=0;i<array.length;i++){
            sum = sum + array[i];
        }

        System.out.println(sum);



    }
}
