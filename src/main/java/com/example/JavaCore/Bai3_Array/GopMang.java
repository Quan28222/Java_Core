package com.example.JavaCore.Bai3_Array;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int i = 0;
        System.out.println("Moi ban nhap mang thu 1");
        //cach 1:
//        while (i < array1.length) {
//            System.out.print("Vui long nhap gia tri " + (i + 1) + " cho mang : ");
//            array1[i] = scanner.nextInt();
//            i++;
//        }
        // cach 2:
        for ( i = 0; i < array1.length; i++) {
            System.out.print("Vui long nhap gia tri " + (i + 1) + " cho mang : ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Danh sach gia tri mang ban vua nhap la: " + Arrays.toString(array1));

        System.out.println("Moi ban nhap mang thu 2");
        i = 0;
        //cach 1:
//        while (i < array2.length) {
//            System.out.print("Vui long nhap gia tri " + (i + 1) + " cho mang : ");
//            array2[i] = scanner.nextInt();
//            i++;
//        }
        // cach 2:
        for ( i = 0; i < array2.length; i++) {
            System.out.print("Vui long nhap gia tri " + (i + 1) + " cho mang : ");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Danh sach gia tri mang ban vua nhap la: " + Arrays.toString(array2));


        // cach 1:
        int[] array3 = new int[array1.length + array2.length];
        for(int k = 0; k < array3.length; k++){
            if(k < array1.length){
                array3[k] = array1[k];
            }else{
                array3[k] = array2[k- array1.length];
            }
        }

        // cach 2:
//        for(int k = 0; k < array1.length; k++){
//            array3[k] = array1[k];
//        }
//        for(int k = 0; k < array2.length; k++){
//            array3[k + array1.length] = array2[k];
//        }


        // --------in ra mang 3
        System.out.print("Danh sach mang 3 la: " +Arrays.toString(array3));


    }
}
