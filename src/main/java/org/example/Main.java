package org.example;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
         // for each 는 배열 반복할때 쓰임

//        Scanner sc = new Scanner(System.in);
//
//        String[] input = sc.nextLine().split(" ");
//
//        long sum = Arrays.stream(input) // 연산하기 쉽도록 배열 타입을 바꿔줌
//                .mapToLong(  )// 매칭을 의미(스트링 하나당 lng으로 바꾸겠따)
//                .peek()
//                .sum();
        /// /스트림
    // 반복문이 필요할 때 유용하게 쓰임
        //스트림 환경에서는 입력 시 한번에 적용됨
        //스트림을 사용하면 입력을 받는 배열을 줄일 수 있음
        //sum()은 더하기를 해주는 메서드
        //sc.close()는 불필요하게 실행되는 sc변수를 닫아줌

        //기본적으로 스트림범위는 이상 미만이다
        //스트림의 출력형태는 다양해서 편한거 골라잡아라잉

        //스트림은 끝내는 문법이 있음
        //문법 익숙해지기 별별별

    //    stream 메서드
    //    filter 조건을 걸어 걸러내기
    //    map 걸러낸걸 원하는 값을 포장하기
    //    boxed 해당 인스턴스타입으로 교체
    //    collect 같은 타입으로 받아줌

    }
}
