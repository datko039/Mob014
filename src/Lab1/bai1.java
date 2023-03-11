package Lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Diem trung binh: ");
        double diemTB = sc.nextDouble();
        System.out.printf("%s\n %f",hoTen,diemTB);
    }
}
