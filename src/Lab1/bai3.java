package Lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap canh : ");
        double canh = sc.nextDouble();
        double theTich = canh*canh*canh;
        System.out.print("The tich la :"+theTich);
    }
}
