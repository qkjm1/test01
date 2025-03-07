package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr= {5,1,4} ;
        int[] a = new int [arr[0]+arr[1]+arr[2]];
        int b=0;


            for (int j=0;j<arr[0];j++){
                a[j]=arr[0];
            }
            for (int k=arr[0]+arr[1];k<arr[1];k++){
                a[k]=arr[1];
            }
            for (int m=arr[0]+arr[1]+arr[2];m<arr[2];m++){
                a[m]=arr[2];
            }

for (int t=0;t<a.length;t++) {
    System.out.println(a[t]);
}



    }
}



