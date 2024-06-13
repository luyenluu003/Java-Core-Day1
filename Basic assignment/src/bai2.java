import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so tu nhien n (n > 0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui long nhap so tu nhien n > 0.");
            }
        } while (n <= 0);
        int count=0;
        System.out.println("Cac uoc so cua "+n+" la:");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nSo luong uoc so cua "+n+" la:"+count);

        sc.close();
    }
}
