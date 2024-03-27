package com.example.JavaCore.Bai3_Array;

import java.util.Arrays;

public class Mang {
    public static void main(String[] args) {
        //Khai bao mang
        int[] mangInt;
        double[] mangDouble;
        boolean[] mangBooolean;


        //Khoi tao mang kem theo kich thuoc
        String[] mangString = new String[15]; // chua duoc toi da 15 phan tu
        int[] mangInt2 = new int[25]; // chua toi da duoc 25 phan tu
        mangInt = new int[]{10, 20, 30, 40, 50};
        mangDouble = new double[]{1.5, 5.6, 4.5};

        // khoi tao mang kem gia tri ban dau
        String[] student = new String[]{"Quan", "Hai", "Son", "Duc", "Thai"};
        int[] classStuden = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Truy xuat phan tu cua mang theo index
        System.out.println("================");
        System.out.println("Truy xuat phan tu cua mang theo index");
        System.out.println(student[4]);
        System.out.println(classStuden[4]);
        System.out.println(mangString[3]);
        System.out.println(mangInt2[7]);
        System.out.println(mangDouble[2]);
        System.out.println(mangInt[3]);

        // Truy xuat phan tu cua mang
        System.out.println("================");
        System.out.println("Truy xuat phan tu cua mang");
        System.out.println(student.length);
        System.out.println(classStuden.length);
        System.out.println(mangString.length);
        System.out.println(mangInt2.length);
        System.out.println(mangDouble.length);
        System.out.println(mangInt.length);


        // Duyet mang dung for
        // cach 1:
        System.out.println("Duyet mang");
        System.out.println("================");
        int[] mang4 = new int[]{1, 2, 4, 6, 7};
        for (int in : mang4) {
            System.out.print(in + "\t");
        }
        System.out.println();

        String[] mang5 = new String[]{"Hai", "Son", "Duc", "Thai"};
        for (String listStudent : mang5) {
            System.out.print(listStudent + "\t");
        }
        System.out.println();
        // cach 2
        int[] mang6 = new int[]{100, 200, 300, 400};
        for (int i = 0; i < mang6.length; i++) {
//            System.out.println(i);
            System.out.println(mang6[i]);
        }

        //Thay doi gtri cua mang tai vi tri index
        System.out.println("================");

        System.out.print("\ngia tri ban dau: "+mang6[1]);
        mang6[1] = 250;
        for (int i = 0; i < mang6.length; i++) {
//            System.out.println(i);
            System.out.println(mang6[i]);
        }

        System.out.println("gia tri ban dau: "+mang6[1]);
        mang6[1] = 350;
        System.out.println("Gia tri sau khi thay doi: "+ mang6[1]);

        // update toan bo danh sach
        System.out.println("================");

        int[] mang7 = new int[]{100, 200, 300, 400};
        for (int i = 0; i < mang7.length; i++) {
            mang7[i] += 5;
        }

        System.out.println("Gia tri sau khi thay doi: ");
        for (int i = 0; i < mang7.length; i++) {
            System.out.println(mang7[i]);
        }

        // Sap sep mang tang dan
        System.out.println("================");
        int[] mang8 = new int[]{200, 100, 500, 300, 400};
        System.out.println("Mang 8 truoc khi sap xep la: "+Arrays.toString(mang8));
        Arrays.sort(mang8);
        System.out.println("Mang 8 sau khi sap xep la: "+Arrays.toString(mang8));


        // dao nguoc vtri trong mang
        System.out.println("================");
        int[] mang10 = new int[]{200, 100, 500, 300, 400};
        System.out.println("Mang 10 truoc khi dao vi tri la: "+Arrays.toString(mang10));
        for (int i = 0, j = mang10.length-1; i<j; i++, j--){
            int temp = mang10[i];  // tao bien tam temp
            mang10[i] = mang10[j];
            mang10[j] = temp;
        }

        System.out.print("Mang 10 sau khi dao vi tri la: ");
        System.out.println(Arrays.toString(mang10));

        // phep gan mang truy suat cung vung nho
        System.out.println("================");
        int[] mang9 = new int[]{200, 100, 500, 300, 400};
        System.out.println("Mang 9 truoc khi thay doi gia tri la: "+Arrays.toString(mang9));
        int[] mang11 = mang9;
        System.out.println("Mang 11 truoc khi thay doi gia tri la: "+Arrays.toString(mang11));
        System.out.println("================");
        // thay doi mang 9 tai vi tri 0
        mang9[0] = 250;
        System.out.println("Mang 9 sau khi thay doi gia tri la: "+Arrays.toString(mang9));
        System.out.println("Mang 11 sau khi thay doi gia tri la: "+Arrays.toString(mang11));

        // clone mang, tao mang moi cung gia tri(Luu tren vung nho khac)

        System.out.println("================");
        int[] mang12 = new int[]{200, 100, 500, 300, 400};
        System.out.println("Mang 12 truoc khi clone la: "+Arrays.toString(mang12));
        int[] mang13 = mang12.clone();
        mang13[2] = 123;
        System.out.println("Mang 13 truoc khi clone la: "+Arrays.toString(mang13));
        System.out.println("================");
        System.out.println("Mang 12 sau khi clone la: "+Arrays.toString(mang12));
        System.out.println("Mang 13 sau khi clone la: "+Arrays.toString(mang13));
    }
}
