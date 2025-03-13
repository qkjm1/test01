package org.example;

//import java.awt.*;
//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //상속되어있을때는 부모의 생성자도 실행
        // 자식클래스에도 생성자가있으면 부모 > 자식 순으로 실행

     // 대여가 가능한 책의 목록을 출력하는 프로그램
        //5권의 샘플 책을 배열에 하나씩
        book[] books = new book[10];
        books[0] = new book ("어쩌구",34,true);
        books[1] = new book ("ㄷ쩌구",74,true);
        books[2] = new book ("저쩌구",34,true);
        books[3] = new book ("ㅎ쩌구",90,true);
        books[4] = new book ("ㅗ쩌구",23,true);


        System.out.println(books[0].toString());
    }
}
class book {
    String 책제목;
    int 가격;
    boolean 대여;

    book(String 이름, int 돈, boolean 빌림){

    }
    void rented(boolean 대여시작){
        this.대여 =true;
    }
    void returned(boolean 반납완료){
        this.대여=false;
    }




}
