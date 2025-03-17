package org.example;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b>=45){
            if (a==0){
                System.out.println(a+" "+(b-45));
            }else {
                System.out.println(a+" "+(b-45));
            }

        }else if (b<45){
            if (a==0){
                a=24;
                System.out.println((a-1)+" "+(b+60-45));
            }else {
                System.out.println((a-1)+" "+(b+60-45));
            }
        }

    }
}