package Lab2;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        int so=0;
        do{
            System.out.println("+-----------------------------------+");
            System.out.println("1: Giải phương trình bậc nhất");
            System.out.println("2: Giải phương trình bậc hai");
            System.out.println("3: Tính tiền điện");
            System.out.println("4: Kết thúc");
            System.out.println("+-----------------------------------+");
            Scanner sc = new Scanner(System.in);
            System.out.print("Moi bạn chọn chức năng : ");
            so = sc.nextInt();
            switch (so){
                case 1: {
                    System.out.println("Giải phương trình bậc nhất : Ax + b = 0\n");
                    break;
                }
                case 2: {
                    System.out.println("Giải phương trình bậc hai : Ax2 + bx + c = 0");
                    break;
                }
                case 3: {
                    System.out.println("3: Tính tiền điện");
                    break;
                }
                case 4: {
                    System.out.println("4: Kết thúc");
                    break;
                }
                case 0:
                    System.out.println("Bạn đã thoát chương trình!");
                    break;
                default:
                    System.out.println("Bạn chọn sai menu trên vui lòng chọn lại!");
            }
        }while (so!=0);
    }
}
