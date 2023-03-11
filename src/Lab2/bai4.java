package Lab2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int so;
            do{
                System.out.println("+-----------------------------------+");
                System.out.println("1: Giải phương trình bậc nhất");
                System.out.println("2: Giải phương trình bậc hai");
                System.out.println("3: Tính tiền điện");
                System.out.println("0: Kết thúc");
                System.out.println("+-----------------------------------+");
                Scanner sc = new Scanner(System.in);
                System.out.print("Moi bạn chọn chức năng : ");
                so = sc.nextInt();
                switch (so){
                    case 1: {
                        System.out.println("Giải phương trình bậc nhất : Ax + b = 0");
                        Scanner sa = new Scanner(System.in);
                        double a,b;
                        System.out.print("Nhập a :");
                        a = sa.nextDouble();
                        System.out.print("Nhập b :");
                        b = sa.nextDouble();
                        double x = -b/a;
                        if (a == 0) {
                            if (b == 0) {
                                System.out.println("Phương trình vô số nghiệm");
                            }else {
                                System.out.println("Phương Trình vô nghiệm");
                            }
                        }else System.out.println("Phương trình có nghiệm"+x);
                        break;
                    }
                    case 2: {
                        System.out.println("Giải phương trình bậc hai : Ax2 + bx + c = 0");
                        Scanner sb = new Scanner(System.in);
                        double a,b,c,x1,x2;
                        System.out.print("Nhap a : ");
                        a = sb.nextDouble();
                        System.out.print("Nhap b : ");
                        b = sb.nextDouble();
                        System.out.print("Nhap c : ");
                        c = sb.nextDouble();
                        double delta = b*b - 4*a*c;
                        if (a == 0) {
                            System.out.println("Giải phương trình bậc nhất!");
                        }else{
                            if (delta < 0) {
                                System.out.println("Phương trình vô nghiệm!");
                            } else if (delta == 0) {
                                System.out.print("Phương trình có nghiệm kép X= : "+((-b)/(2*a)));
                            }else {
                                System.out.println("Phương trình có 2 nghiệm phân biệt  X1 = "+(-b + Math.sqrt(delta))/(2*a) +"\n \t\t\t\t\t\t\t\t\t"+"X2 = "+(-b - Math.sqrt(delta))/(2*a));
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("3: Tính tiền điện");
                        int tienDien,soDien;
                        Scanner sd = new Scanner(System.in);
                        System.out.print("Nhập số điện :");
                        soDien = sd.nextInt();
                        if (soDien <= 50) {
                            tienDien = soDien*1000;
                            System.out.print("Tiền điện là : "+tienDien);
                        }else {
                            tienDien = 50*1000 + (soDien-50)*1200;
                            System.out.print("Tiền điện là : "+tienDien);
                        }
                        break;
                    }
                    case 0:
                        System.out.println("Bạn đã kết thúc chương trình!");
                        break;
                    default:
                        System.out.print("Bạn chọn sai menu trên vui lòng chọn lại!");
                }
            }while (so!=0);
    }
}
