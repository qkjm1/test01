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
        //저는 1번, 홍길동, 20살 입니다.
    }

}

class 사람인력관리소{
    static int no;
    int age;
    String name;

    void 자기소개 (){
        System.out.println("저는"+no+"번,"+name+", "+age+"살 입니다.");
    }
    void add사람 (String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("나이가 "+this.age+"살인 "+no+"번째 사람("+this.name+")이 추가되었습니다");
        no++;
    }
    void get사람 (int nu){
        no = nu;

    }

}
class 사람 extends 사람인력관리소 {

}
