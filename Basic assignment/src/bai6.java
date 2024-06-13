import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so nguyen n (n > 1): ");
            n = sc.nextInt();
            if (n <= 1) {
                System.out.println("Vui long nhap so nguyen n > 1.");
            }
        } while (n <= 0);
        System.out.println("Tich cac thua so nguyen to cua "+n+" la:");
        for(int i = 2; i <= Math.sqrt(n); i++){
            while(n % i == 0){
                System.out.print(i);
                n /= i;
                if(n > 1){
                    System.out.print(" x ");
                }
            }
        }
        if(n > 1){
            System.out.print(n);
        }

        sc.close();
    }
}
