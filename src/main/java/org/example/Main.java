package org.example;

//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//
//        a사람.나이 = 20;
//        a사람.a왼팔 = new 팔();
//
//        a사람.a왼팔.길이 =10;
//    }
//}
//
//class 사람 {
//    // 클래스안에 변수를 정의 할 수 있다.
//    int 나이;
//    팔 a왼팔;
//}
//class 팔{
//    int 길이;
//}
// 클래스끼리 엮은 형태 a사람.a왼팔.길이 =10;



        //...........
//        전사 a전사 = new 전사();
//
//        a전사.나이 = 20;
//        a전사.a무기 = new 활();
//        a전사.a무기 = new 칼();
//    }
//}
//class 전사 {
//    int 나이;
//    무기 a무기;
//
//}
//class 무기{
//
//}
//class 활 extends 무기{
//
//}
//class 칼 extends 무기{
//
//}


// .......문제 : 아래가 실행되도록 해주세요.
//
//                전사 a전사 = new 전사();
//
//                String 이름 = "칸";
//                a전사.이름 = 이름;
//                a전사.나이 = 20;
//                a전사.자기소개();
//
//                a전사.나이++;
//                a전사.자기소개();
//
//                a전사.나이 = 30;
//                a전사.이름 = "ㄷㄱ";
//                a전사.자기소개();
//
//                a전사.a무기 = new 활();
//                a전사.공격();
//                // 출력 : 카니가 활로 공격합니다.
//
//                a전사.a무기 = new 칼();
//                a전사.공격();
//                // 출력 : 카니가 칼로 공격합니다.
//            }
//        }
//
//        class 전사 {
//            // 인스턴스 변수
//            String 이름;
//            // 인스턴스 변수
//            int 나이;
//            // 인스턴스 변수
//            무기 a무기;
//
//
//
////공격이라는 메소드에 칼,활 객체를 부르는 선언구가 필요해
//
//            void 자기소개() {
//                System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
//            }
//            void 공격(){
//                this.a무기.호출(this.이름);
//
////                System.out.println(this.이름+"가 "+this.a무기+"로 공격합니다");
//            }////공격에서 각 객체로 연결되도록??
//            /// 주소가 뜨는 이유 객체 안이 비어잇기때문에 객체 안에서 선언될수잇도록
//
//        }
//
//        class 무기 {
//        ///// 여기서 호출할수 있게끔
//            void 호출(String 공격자_이름){
//               /// 상위클래스가 틀을 가지고잇어야함
//            }
//            }
//
//
//        class 칼 extends 무기 {
//            void 호출(String 공격자_이름){
//                System.out.println(공격자_이름+"가 칼을~");
//            }
//        }
//
//        class 활 extends 무기 {
//            void 호출(String 공격자_이름){
//                System.out.println(공격자_이름+"가 활을~");
//            }
//        }
//
///// ///.............................

//전사 a전사 = new 전사();
//
//String 이름 = "칸";
//a전사.이름 = 이름;
//a전사.나이 = 20;
//        a전사.자기소개();
//
//a전사.나이++;
//        a전사.자기소개();
//
//a전사.나이 = 30;
//a전사.이름 = "ㄷㄱ";
//        a전사.자기소개();
//
//a전사.a무기 = new 활();
//                a전사.공격();
//// 출력 : 카니가 활로 공격합니다.
//
//a전사.a무기 = new 칼();
//                a전사.공격();
//// 출력 : 카니가 칼로 공격합니다.
//            }
//                    }
//
//
//        /// //매개변수없이
//class 전사 {
//    // 인스턴스 변수
//    String 이름;
//    // 인스턴스 변수
//    int 나이;
//    // 인스턴스 변수
//    무기 a무기;
//
//
//
////공격이라는 메소드에 칼,활 객체를 부르는 선언구가 필요해
//
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
//    }
//    void 공격(){
//        a무기.공격자명 = 이름;
//        this.a무기.호출(this.이름);
//
//
//
////                System.out.println(this.이름+"가 "+this.a무기+"로 공격합니다");
//    }////공격에서 각 객체로 연결되도록??
//    /// 주소가 뜨는 이유 객체 안이 비어잇기때문에 객체 안에서 선언될수잇도록
//
//}
//
//class 무기 {
//    ///// 여기서 호출할수 있게끔
//    void 호출(String 공격자_이름){
//        /// 상위클래스가 틀을 가지고잇어야함
//    }
//    String 공격자명;
//}
//
//
//class 칼 extends 무기 {
//    void 호출(){
//        System.out.println(공격자명+"가 칼을~");
//    }
//}
//
//class 활 extends 무기 {
//    void 호출(String 공격자_이름){
//        System.out.println(공격자명+"가 활을~");
//    }
//}