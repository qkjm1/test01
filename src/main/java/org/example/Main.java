package org.example;

//import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ///구구단 출력하기
//        int n=0;
//        for(int i=1;i<9;i++){
//            n +=1;
//            System.out.println("=="+n+"단==");
//            for(int j=1;j<9;j++){
//                int k=1+j;
//                System.out.println(n+"x"+k+"="+(n*k));
//            }
//        }

        /// 삼각혈형 별찍기
//        for(int i=0;i<5;i++){
//            for(int j=i;j<i+1;j++){
//                for(int n=0;n<j+1;n++){
//                    System.out.print(" ");
//                }
//            }
//
//        }


// 게시글에서 번호를 매기는 이유는 데이터를 메꾸면 오류가 발생할수도있기때문에
        /// //static
        // 클래식변수, 객체생성과 무관. 모든 인스턴스가 공유
        //스테틱 변수를 초기화하는 방법으로는 스테틱생성시 , 필드안에서 이렇게 두개중하나
        // 객체 생성과 동시에 증감연산
        //this(매개변수)cons cal
        //생성자안에 생성자 생성

        /// /배열

        //접근속도가 빠름 앞줄을 채우지않음

/////// 공간을 남긴다고햇는데 ARRAY는 앞으로 자동적으로 당긴다면 공간을 어케남김?


//
//
//        /// /형태 이해하기
//
//        String[]array=new String[10];
//        ArrayList<String> list = new ArrayList<>(10);
//

//
//        v4();
//    }
//
//    static void v4() {
//        System.out.println("==v4==");
//        List <Article> articles = new ArrayList<>();
//        articles.add(new Article()); // index : 0 , id : 1
//        articles.add(new Article()); // index : 1 , id : 2
//        articles.add(new Article()); // index : 2 , id : 3
//
//        articles.remove(2);
//
//        for (int i = 0; i < articles.size(); i++) {
//            Article article = articles.get(i);
//            System.out.println(article.id);
//        }
//    }
//
//
//
////    static void v3() {
////        System.out.println("==v3==");
////        ArrayList
////                articles = new ArrayList<>();
////        articles.add(new Article()); // index : 0 , id : 1
////        articles.add(new Article()); // index : 1 , id : 2
////        articles.add(new Article()); // index : 2 , id : 3
////        articles.add(new Article()); // index : 3 , id : 4
////
////        for (int i = 0; i < articles.size(); i++) {
////            Article article = articles.get(i);
////            System.out.println(article.id);
////        }
////    }
//
////    static void v2() {
////        System.out.println("==v2==");
////        ArrayList articles = new ArrayList();
////        articles.add(new Article()); // index : 0 , id : 1
////        articles.add(new Article()); // index : 1 , id : 2
////        articles.add(new Article()); // index : 2 , id : 3
////        articles.add(new Article()); // index : 3 , id : 4
////
////        ArrayList.remove(2); // 꺽새 사용이 안되어잇어서 변수 고정을 안했기 때문에
////
////        for (int i = 0; i < articles.size(); i++) {
////            Article article = (Article) articles.get(i);
////            System.out.println(article.id);
////        }
////    }
//
////    static void v1() {
////        System.out.println("==v1==");
////        Article[] articles = new Article[100];
////
////        int articlesSize = 0;
////
////        articles[0] = new Article();
////        articlesSize++;
////        articles[1] = new Article();
////        articlesSize++;
////        articles[2] = new Article();
////        articlesSize++;
////        articles[3] = new Article();
////        articlesSize++;
////        articles[4] = new Article();
////        articlesSize++;
////
////        for (int i = 0; i < articlesSize; i++) {
////            System.out.println(articles[i].id);
////        }
////    }
//}
//
//class Article {
//    static int lastId;
//
//    int id;
//    String regDate;
//
//    static {
//        lastId = 0;
//    }
//
//    Article() {
//        this(lastId + 1, "2025-12-12 12:12:12"); // 다른 생성자 호출(실행), Constructor Call
//        lastId++;
//    }
//
//    Article(int id, String regDate) {
//        this.id = id;
//        this.regDate = regDate;
//    }
//}
//
//
//    }
//}


     //리턴 다시보기
     //받는것 seter
     //주는것 geter
    }

}