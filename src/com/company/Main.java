package com.company;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ray = new int[n];
        //for (int i = 0; i < 10; i++) {
        //    ray[i] = scan.nextInt();
        //}
        //for (int i = 9; i >= 0; i--) {
        //   System.out.print(ray[i] + " ");
        //}
        for (int i=0;i<n;i++){
            ray[i] = scan.nextInt();
        }
        for (int i=0;i<n;i++){//เรียงลำดับน้อยไปมาก
            int mt = 0;
            for (int j=i+1;j<n;j++){
                if (ray[i]>ray[j]){
                    mt = ray[i];
                    ray[i] = ray[j];
                    ray[j] = mt;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.printf("%d ",ray[i]);
        }
    }
}
