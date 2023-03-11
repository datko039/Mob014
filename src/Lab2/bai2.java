package Lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc hai : Ax2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        double a,b,c,x1,x2;
        System.out.print("Nhap a : ");
        a = sc.nextDouble();
        System.out.print("Nhap b : ");
        b = sc.nextDouble();
        System.out.print("Nhap c : ");
        c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if (a == 0) {
            System.out.print("Giải phương trình bậc nhất!");
        }else{
            if (delta < 0) {
                System.out.print("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                System.out.print("Phương trình có nghiệm kép X= : "+((-b)/(2*a)));
            }else {
                System.out.print("Phương trình có 2 nghiệm phân biệt  X1 = "+(-b + Math.sqrt(delta))/(2*a) +"\n \t\t\t\t\t\t\t\t\t"+"X2 = "+(-b - Math.sqrt(delta))/(2*a));
            }
        }
    }
}
