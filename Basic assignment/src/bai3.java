import java.util.Scanner;

public class bai3 {

    public static int USCLN(int a,int b){
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public static int BSCNN(int a ,int b){
        return (a*b)/(USCLN(a,b));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        do {
            System.out.print("Nhap so nguyen duong a (a > 0): ");
            a = sc.nextInt();
            if (a <= 0) {
                System.out.println("Vui long nhap so nguyen duong a > 0.");
            }
        } while (a <= 0);
        do{
            System.out.print("Nhap so nguyen duong b (b > 0): ");
            b= sc.nextInt();
            if(b <= 0){
                System.out.println("Vui long nhap so nguyen duong b > 0.");
            }
        }while (b <= 0);

        System.out.println("Uoc so chung lon nhat cua a va b la:"+ USCLN(a,b));
        System.out.println("Boi so chung nho nhat cua a va b la:"+ BSCNN(a,b));
        sc.close();

    }
}
