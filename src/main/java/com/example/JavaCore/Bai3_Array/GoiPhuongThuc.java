package com.example.JavaCore.Bai3_Array;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class GoiPhuongThuc {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        int k = max(a, b); // tim so lon nhat trong 2 so a,b goi tu phuong thuc max
        System.out.println("So lon nhat la: " + k);
        int n = m(1,2,3);
        System.out.println(n);
    }

    public static int max(int so1, int so2) {
        int result;
        if (so1 > so2) {  // dieu kien so sanh de tim so lon nhat
            result = so1;
        } else {
            result = so2;
        }
        return result;
    }

    static int m(int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }
}
