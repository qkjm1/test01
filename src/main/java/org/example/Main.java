package org.example;

//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("== 표준Tv 리모콘 들여오기 전 ==");
//        샤오미Tv a샤오미Tv = new 샤오미Tv();
//        삼성Tv a삼성Tv = new 삼성Tv();
//        LGTv aLGTv = new LGTv();
//
//
//        a샤오미Tv.켜기();
//        // 출력 => 샤오미Tv 켜집니다.
//        a샤오미Tv.끄기();
//        // 출력 => 샤오미Tv 꺼집니다.
//        a샤오미Tv.vr켜기();
//        // 출력 => 샤오미Tv vr켜기!
//
//        a삼성Tv.켜기();
//        // 출력 => 삼성Tv 켜집니다.
//        a삼성Tv.끄기();
//        // 출력 => 삼성Tv 꺼집니다.
//        a삼성Tv.ar켜기();
//        // 출력 => 삼성Tv ar켜기!
//
//        aLGTv.켜기();
//        // 출력 => LGTv 켜집니다.
//        aLGTv.끄기();
//        // 출력 => LGTv 꺼집니다.
//        aLGTv.게임모드전환();
//        // 출력 => LGTv 게임모드전환!
//
//        System.out.println("== 표준Tv 리모콘 들여온 후 ==");
//
//        표준Tv a표준Tv;
//        a표준Tv=a샤오미Tv;
//        a표준Tv.켜기();
//
//        표준Tv abc[] = new 표준Tv[3];
//        abc[0]= aLGTv;
//        abc[1]= a삼성Tv;
//        abc[2]= a샤오미Tv;
//
//        abc[2].끄기();
//
//    }
//}
//class 표준Tv{
//
//    void 켜기(){}
//    void 끄기(){}
//}
//class 샤오미Tv extends 표준Tv{
//    void vr켜기(){
//        System.out.println(" vr켜기!");
//    }
//    void 끄기(){
//        System.out.println( "샤오미Tv 꺼집니다.");
//    }
//    void 켜기(){
//        System.out.println( "샤오미Tv 켜집니다.");
//    }
//}
//class 삼성Tv extends 표준Tv{
//    void ar켜기(){
//        System.out.println(" ar켜기!");
//    }
//    void 끄기(){
//        System.out.println("삼성Tv 꺼집니다." );
//    }void 켜기(){
//        System.out.println( "삼성Tv 켜집니다.");
//    }
//}
//class LGTv extends 표준Tv{
//    void 게임모드전환(){
//        System.out.println(" 게임모드전환!");
//    }  void 끄기(){
//        System.out.println( "LGTv 꺼집니다.");
//    }void 켜기(){
//        System.out.println("LGTv 켜집니다." );
//    }
//
//    }


//        int i = 10;
//        double d =  i; // 여기선 자동형변환 허용
//        i = (int) d; // 여기선 자동형변환 불가능




//        class Main {
//            public static void main(String[] args) {
//                // 수정가능지역 시작
//                페라리 a페라리 = new 페라리();
//                자동차 a자동차;
/// /페라리 a페라리=a자동차는 될수없음
        // 상위식에서의 변환이 생길수잇기때문에 하위식이 오류가 발생
        // 그럼에있어 강제형변환이 필요함
//                a자동차 = (자동차)a페라리;
//
//                // 수정가능지역 끝
//            }
//        }
//        class 자동차 {
//            void 달리다() {}
//            void 서다() {}
//        }
//        class 페라리 extends 자동차 {
//            void 뚜껑이_열리다() {}
//        }

//  올바른 리턴타입
        // 아주 중요
        //집에서 해볼것
        // 참조형 타입의 리턴값이 없을때는 null로 표현
        // 형태 잘 파악하기
        // 클래스.변수명=해달 클래스.변수명();
        // 오르쪽은 객체를 가짐 인스턴스를 갖는다는 의미

        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
        사람 a사람2 = 로봇.get사람2();
        사람 a사람3 = 로봇.get사람3();
        사람 a사람4 = 로봇.get사람4();
        사람 a사람5 = 로봇.get사람5(123, false);
        로봇.get사람6(123, false);

    }
}
// static을 사용하면 객체없이 호출이 가능함
class 사람{}
class 로봇{
    static 사람 get사람(){
        return null;
    }
    static 사람 get사람2(){
        return null;
    }
    static 사람 get사람3(){
        return null;
    }
    static 사람 get사람4(){
        return null;
    }
    static 사람 get사람5(int i , boolean b){
        return null;
    }
    static 사람 get사람6(int i , boolean b){
        return null;
    }
    static int get정수(){
        return 0;
    }
    static boolean get논리(){
        return true;
    }

















    }



