package com.example.JavaCore.Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class DemSoLuongTrongMang {
    public static void main(String[] args) {
        int [] arr;
        int soLuongSV;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Moi ban nhap vao so luong SV: ");
            soLuongSV = scanner.nextInt();
            if(soLuongSV > 20){
                System.out.print("Nhap so luong nho hon 20: ");
            }
        }while (soLuongSV > 20);

        arr = new int[soLuongSV];
        int i = 0;
        while (i < arr.length){
            System.out.print("Nhap gia tri cho mang " + (i + 1) +": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int dem = 0;
        for (int k : arr) {
            System.out.println("Mang vua nhap la: \t" + Arrays.toString(arr));
            if (k >= 5 && k <= 10) {
                dem++;
            }
        }
        System.out.println("\nSo sinh vien do la: "+dem);
    }
}
