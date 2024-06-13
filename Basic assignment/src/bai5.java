import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so nguyen n (n > 0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui long nhap so nguyen n > 0.");
            }
        } while (n <= 0);
        int sum =0;
        int temp= Math.abs(n);
        while (temp > 0) {
            sum += temp%10;
            temp/=10;
        }
        System.out.println("Tong so "+n+" la: " + sum);

        sc.close();
    }
}
