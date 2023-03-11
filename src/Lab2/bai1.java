package Lab2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.print("Giải phương trình bậc nhất : Ax + b = 0\n");
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.print("Nhập a :");
        a = sc.nextDouble();
        System.out.print("Nhập b :");
        b = sc.nextDouble();
        double x = -b/a;
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phương trình vô số nghiệm");
            }else {
                System.out.print("Phương Trình vô nghiệm");
            }
        }else System.out.print("Phương trình có nghiệm"+x);
    }
}
