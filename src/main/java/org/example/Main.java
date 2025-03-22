package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립(이)가 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(이)가 지팡이(으)로 공격합니다.
    }
}
class 전사{
    String 마지막_무기;
    String 마지막_이름;

    void 공격(String 무기, String 이름){
        마지막_무기 = 무기;
        마지막_이름 = 이름;

        공격출력(무기, 이름);

    }

    void 공격출력(String 무기, String 이름){
        System.out.printf("%s(이)가 %s(으)로 공격합니다.\n",이름,무기);
    }


    void 재공격(){
        System.out.printf("%s(이)가 %s(으)로 공격합니다.\n",마지막_이름,this.마지막_무기);

    }

}
