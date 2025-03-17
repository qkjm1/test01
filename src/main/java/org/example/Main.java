package org.example;


import java.util.ArrayList;
import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        ArrayList[] aa = new ArrayList(a);

        for (int i = 0; i < a; i++) {
            String[] c = sc.nextLine().split(" ");

            aa[i] = Integer.parseInt(c[i]);


        }

        for (int i = 0; i < a; i++) {
            System.out.println(aa[i]);
        }

    }
}
