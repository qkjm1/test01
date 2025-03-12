package org.example;

//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        a전사.공격("브라이언", "칼");
//        // 브라이언이(가) 칼(으)로 공격합니다.
//
//        a전사.재공격();
//        // 브라이언이(가) 칼(으)로 공격합니다.
//
//        a전사.공격("필립", "창");
//        // 필립이(가) 창(으)로 공격합니다.
//
//        a전사.공격("마크", "지팡이");
//        // 마크(가) 지팡이(으)로 공격합니다.
//
//        a전사.재공격();
//        // 마크(가) 지팡이(으)로 공격합니다.
//
//        a전사.재공격();
//
//    }
//}



//class 전사{
//    String 이름;
//    String 무기;
//    void 공격 (String 이름, String 무기){
//        this.이름=이름;
//        this.무기=무기;
//        System.out.printf("%s이(가) %s(으)로 공격합니다.\n",이름,무기);
//    }
//    void 재공격(){
//        System.out.printf("%s이(가) %s(으)로 공격합니다.\n",this.이름,this.무기);
//    }
//}



         int count = 0;
         int n = 24;

         for(int i=1;i<=n;i++){
             if(n%i==0){
                 count++;
             }
         }
        System.out.println(count);
        int[] answer = new int[]{};

        int a=0;
         for(int i=1;i<=n;i++){
             if(n%i==0){
                 answer[a]=i;
                 System.out.println(answer[a]);
             a++;
             }
         }

    }
}