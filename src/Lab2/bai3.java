package Lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int tienDien,soDien;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện :");
        soDien = sc.nextInt();
        if (soDien <= 50) {
            tienDien = soDien*1000;
            System.out.print("Tiền điện là : "+tienDien);
        }else {
            tienDien = 50*1000 + (soDien-50)*1200;
            System.out.print("Tiền điện là : "+tienDien);
        }
    }
}
