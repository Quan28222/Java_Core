package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class TinhSoTienLai {
    public static void main(String[] args) {
        double tien;
        int thang;
        double laiSuat;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so tien: ");
        tien = scanner.nextDouble();

        System.out.print("Nhap vao so thang muon gui: ");
        thang = scanner.nextInt();

        System.out.print("Nhap vao lai suat: ");
        laiSuat = scanner.nextDouble();

        double tongTien;

        tongTien = tien + tien * (laiSuat / 100) / 12 * thang;
        System.out.print("Tong lai nhan duoc la: " + tongTien);
    }
}
