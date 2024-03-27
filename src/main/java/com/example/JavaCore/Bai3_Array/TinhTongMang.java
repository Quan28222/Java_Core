package com.example.JavaCore.Bai3_Array;

public class TinhTongMang {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 3, 5, 7, 9};
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr.length;
        }
        System.out.println("Tong cac phan tu trong mang la: "+tong);
    }
}
