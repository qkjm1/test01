package org.example;

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


        사람인력관리소 a사람인력관리소 = new 사람인력관리소 ();

        a사람인력관리소.add사람("홍길순", 33);
        a사람인력관리소.add사람("홍길동", 20);
        a사람인력관리소.add사람("임꺽정", 30);


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

}

class 사람인력관리소{
    사람 처음_a사람;
    int 저장된_번호;

    void add사람 (String name, int age){
        사람 a사람 = new 사람();
        a사람.no=저장된_번호+1;
        a사람.age=age;
        a사람.name=name;

        System.out.println("나이가 "+a사람.age+"살인 "+a사람.no+"번째 "+a사람.name+"이 추가되었습니다");

        처음_a사람 = a사람;
        this.저장된_번호= a사람.no;
    }
   사람 get사람 (int nu){
        this.저장된_번호 = nu;
        System.out.println(저장된_번호);
        return 처음_a사람;
    }

}
class 사람 {
    int no;
    int age;
    String name;

    void 자기소개 (){

        System.out.println("저는"+no+"번, "+name+", "+age+"살 입니다.");
    }
}
