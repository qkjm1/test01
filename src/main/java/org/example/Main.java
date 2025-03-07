package org.example;





import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = new String();
        char c = ' ';
        str = sc.next();
        c = str.charAt(0);

        for (int i=0;i<str.length();i++){
            c = str.charAt(i);
            System.out.printf("'%c'\n",c);
        }
    }
}



