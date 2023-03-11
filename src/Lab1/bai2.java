package Lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieuRong = sc.nextDouble();
        double chuVi = (chieuDai+chieuRong)*2;
        System.out.print("chu vi la : "+chuVi);
        double dienTich = chieuDai * chieuRong;
        System.out.print("Dien tich la : "+dienTich);
        double canhNho = Math.min(chieuDai,chieuRong);
        System.out.print("canh nho nhat la : "+canhNho);
    }
}
