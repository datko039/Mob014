package Lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        a = sc.nextDouble();
        System.out.print("Nhap b : ");
        b = sc.nextDouble();
        System.out.print("Nhap c : ");
        c = sc.nextDouble();
        double delta = (b*b) - (4*a*c);
        System.out.print("Delta cua phuong trinh la :  "+delta+"\n");
        System.out.print("Can delta la: "+ Math.sqrt(delta));
    }
}
