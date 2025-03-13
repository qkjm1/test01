package org.example;

//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 표준Tv 리모콘 들여오기 전 ==");
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();


        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        표준Tv a표준Tv;
        a표준Tv=a샤오미Tv;
        a표준Tv.켜기();

        표준Tv abc[] = new 표준Tv[3];
        abc[0]= aLGTv;
        abc[1]= a삼성Tv;
        abc[2]= a샤오미Tv;

        abc[2].끄기();

    }
}
class 표준Tv{

    void 켜기(){}
    void 끄기(){}
}
class 샤오미Tv extends 표준Tv{
    void vr켜기(){
        System.out.println(" vr켜기!");
    }
    void 끄기(){
        System.out.println( "샤오미Tv 꺼집니다.");
    }
    void 켜기(){
        System.out.println( "샤오미Tv 켜집니다.");
    }
}
class 삼성Tv extends 표준Tv{
    void ar켜기(){
        System.out.println(" ar켜기!");
    }
    void 끄기(){
        System.out.println("삼성Tv 꺼집니다." );
    }void 켜기(){
        System.out.println( "삼성Tv 켜집니다.");
    }
}
class LGTv extends 표준Tv{
    void 게임모드전환(){
        System.out.println(" 게임모드전환!");
    }  void 끄기(){
        System.out.println( "LGTv 꺼집니다.");
    }void 켜기(){
        System.out.println("LGTv 켜집니다." );
    }

}
//        무기 a무기 = new 칼();
//
//        //
//        a무기.공격();
//    }
//}
//
//class 무기 {
//
//}
//// 객체를만들기위해서 생성자를 필수로 요한다. 무기라는  class를 만들고
//// 새로운 칼
//
//class 칼 extends 무기 {
//    void 공격() { }
//}
//
//

































