package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//          int value = 2;
//          System.out.println(value);
//          printSquare(value);
//          printSquare(3);
//          printSquare(value * 2);
//
//     public static void printSquare(int x) {
//     System.out.println(x * x);
//
//     }

//
//
//
///// /// 1~10까지 배열의 합구하기
//        int [] arr = new int[10];
//        for (int i =0;i<arr.length;i++){
//            arr[i]=i+1;
//            System.out.println(arr[i]);//확인용
//        }
//        System.out.println(sum(arr));
//
//        static int sum(int[] no){
//            int sum =0;
//
//            for (int i =0;i< no.length;i++){
//                sum = no[i];
//                System.out.println(sum);
//            }
//
//
//
//
//            return sum;
//        }




//오브젝트 클래스랑 toString

//        ArrayList <사람>저장=new ArrayList<>();
//        저장.add(new 사람());
//        저장.add(new 사람());
//        저장.add(new 사람());

//        System.out.println(list);

        사람인력관리소 a사람인력관리소 = new 사람인력관리소 ();
        a사람인력관리소.add사람("홍길순", 33);
        a사람인력관리소.add사람("홍길동", 20);
        a사람인력관리소.add사람("임꺽정", 30);
//static은 new 를 받지않겟다

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        //저는 1번, 홍길동, 20살 입니다
        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.
        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
    // 번호랑 같이 인자가 저장되어야함


}
//===
//묶음단위를 잘아야함
/// //힌트를 참고한 방식
//class 사람인력관리소 {
//    사람 a사람;
//    사람 처음_a사람;
//    int 저장된_번호;
//
//    void add사람(String name, int age) {
//        사람 a사람 = new 사람();
//        a사람.no = 저장된_번호 + 1;
//        a사람.age = age;
//        a사람.name = name;
//
//
//        System.out.println("나이가 " + a사람.age + "살인 " + a사람.no + "번째 " + a사람.name + "이 추가되었습니다");
//
//        처음_a사람 = a사람;
//        this.저장된_번호 = a사람.no;
//    }
//
//    사람 get사람(int nu) {
//        저장된_번호 = nu;
//        return 처음_a사람;
//        }
//
//    }
//
//    class 사람 {
//        int no;
//        int age;
//        String name;
//
//        void 자기소개() {
//            System.out.println("저는" + no + "번," + name + ", " + age + "살 입니다.");
//        }
//}
/// /혼자해보기
/// 객체에 저장하고 배열에 객체를 넣고 호출
/// 객체를 객체에 저장
class 사람인력관리소{//번호를 매기는 행위
    사람 사람0;// 저장할 객체 공간 생성
    사람 사람1;
    사람 사람2;

    int 저장된_번호;//초기화 되지않는 번호 생성

    void add사람(String 이름, int 나이){
    사람 a사람=new 사람(); //사람이라는 객체를 이용하기 위해서 객체선언(묶어서 선언)
    a사람.이름=이름;
    a사람.나이=나이;
    a사람.번호=저장된_번호+1;


    /// /if절을 이용해서 저장이가능
//        번호에 따른 저장 (사람0, 사람1, 사람2)
//        if(a사람.번호==1){
//            사람0=a사람;
//;        }else if(a사람.번호==2){
//            사람1=a사람;
//        }else if(a사람.번호==3){
//            사람2=a사람;
//        }
/// 배열에 따른 저장이 가능

        System.out.println("나이가 "+a사람.나이+"살인 "+저장된_번호+"번쨰 "+a사람.이름+"이 추가되었습니다.");
    }
    사람 get사람(int 번호){
    /// if문으로 return
        if(번호==1){
            return 사람0;
        }else if(번호==2){
            return 사람1;
        }else if(번호==3){
            return 사람2;
        }
    return null;
    }
}
class 사람 { //속성을 가지고 사람인력사무소에 적혀야함(자기소개행위)
    int 나이;
    int 번호;
    String 이름;

    void 자기소개() {
        System.out.println("저는 " + 번호 + "번, " + 이름 + ", " + 나이 + "살입니다.");
    }
}
//
// 정보가 추가된다는 과정이 중요