import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        do {
            System.out.print("Nhap so nguyen to a (a > 1): ");
            a = sc.nextInt();
            if (a <= 1) {
                System.out.println("a vua nhap khong phai la so nguyen to vui long nhap lai (a > 1).");
            }
        } while (a <= 1);
        do {
            System.out.print("Nhap so nguyen to b (b > a): ");
            b = sc.nextInt();
            if (b <= 1 ||  b <= a) {
                if (b <= 1 ) {
                    System.out.println("b vua nhap khong phai la so nguyen to vui long nhap lai (b > 1).");
                } else if (b <= a) {
                    System.out.println("b lon hon a. Vui long nhap lai b (b > a).");
                }
            }
        } while (b <= 1 || b <= a);
        System.out.println("So nguyen to trong doan a den b la:");
        for(int i = a; i <= b; i++) {
            boolean check = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }


}
