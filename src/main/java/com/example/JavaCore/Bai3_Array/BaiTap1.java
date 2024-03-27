package com.example.JavaCore.Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // cho nguoi dung nhap n tu ban phim
        System.out.print("Moi ban nhap n: ");
        int n = scanner.nextInt();

        // tao ra mot mang co do dai n
        int [] array = new int[n];
        System.out.println("So phan tu cua mang: " +array.length);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap array ["+i+"] = "); // nhap du lieu cho tung phan tu
            array[i] = scanner.nextInt();
        }

        // suat mang
        System.out.print("Mang vua duoc tao ra la: ");
        System.out.print(Arrays.toString(array));

        // sap sep mang tang dan
        Arrays.sort(array);
        System.out.print("\nMang sau khi sap xep tang la: ");
        System.out.print(Arrays.toString(array));

        // dao nguoc vtri cua mang
        for (int i = 0, j = array.length-1; i<j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        // suat mang
        System.out.print("\nMang sao khi dao vi tri la: ");
        System.out.print(Arrays.toString(array));
    }
}
