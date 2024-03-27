package com.example.JavaCore.Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so: ");
        int so = scanner.nextInt();
        System.out.print("Nhap vao vi tri can chen trong mang: ");
        int viTri = scanner.nextInt();
//        if (index < 0 && index > arr.length) {
//            System.out.println("Khong chen duoc phan tu vao mang");
//        }
        System.out.println("Mang ban dau la: " + Arrays.toString(arr));

        // Them phan tu vao cuoi mang
        int[] mangMoi = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            mangMoi[i] = arr[i];
        }
        mangMoi[mangMoi.length - 1] = so;
        arr = mangMoi;
        System.out.println("Mang sau khi them la: " + Arrays.toString(mangMoi));

        // Them phan tu vao dau mang
        for (int i = mangMoi.length - 1; i > 0; i--) {
            mangMoi[i] = mangMoi[i - 1];
        }
        mangMoi[0] = so;
        System.out.println("Mang sau khi them la: " + Arrays.toString(mangMoi));

        // Them phan tu theo index vao mang
        int[] mangMoi1 = new int[mangMoi.length + 1];
        for (int i = mangMoi1.length - 1; i >= 0; i--) {
            if(i > viTri){
                mangMoi1[i] = mangMoi[i - 1];
            }
            else if(i == viTri){
                mangMoi1[viTri] = so;
            }
            else {
                mangMoi1[i] = mangMoi[i];
            }
        }

        System.out.println("Mang sau khi them la: " + Arrays.toString(mangMoi1));
    }
}
