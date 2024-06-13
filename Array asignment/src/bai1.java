import java.util.Scanner;

public class bai1 {

    public static void inputArray(int a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
    }

    public static void ouputArray(int a[],int n){
        System.out.print("Phan tu cua mang la: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static boolean Check (int a[],int n){
        for(int i = 0; i < n / 2; i++){
            if(a[i] != a[n - i - 1]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so phan tu cua mang (n>0): ");
            n = sc.nextInt();
        } while (n < 0);

        int a[] = new int[n];
        inputArray(a,n);
        ouputArray(a,n);
        System.out.println("Check mang doi xung:"+Check(a,n));
        sc.close();
    }
}
