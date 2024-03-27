package com.example.JavaCore.Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int x;
        int index = 0;
        int[] arr = {1, 2, 3, 4, 5, 6};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x: ");
        x = scanner.nextInt();

        boolean kiemTra = false;
        int viTri = 0;
        for (int i = 0; i < x; i++) {
            if (arr[i] == x) {
                kiemTra = true;
                viTri += i;
            }
        }
        if (kiemTra)
            System.out.println(x + " Ton tai trong mang tai vi tri: " + viTri);
        else
            System.out.println(x + " Khong ton tai trong mang");

        System.out.println("Mang ban dau la: " + Arrays.toString(arr));

        for (int i = x; i < arr.length -1; i++) {
            arr[i] = arr[i+1];
        }

        int [] mangMoi =  new int [arr.length-1];
        for (int i = 0; i < mangMoi.length; i++) {
            mangMoi[i] = arr[i];
            System.out.println("Mang sau khi xoa la: " +mangMoi[i]);

//            System.out.println("------------------------------------");

//            System.out.println("Mang sau khi xoa la: " +arr[i]);

        }
    }
}
