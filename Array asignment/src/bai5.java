import java.util.Scanner;

public class bai5 {
    public static void inputArray(int a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("["+i+"]: ");
            a[i]=sc.nextInt();
        }
    }

    public static void ouputArray(int a[],int n){

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static void insertArray(int a[],int n,int b[],int m,int p){
        int[] newArray = new int[n + m];
        for (int i = 0; i < p; i++) {
            newArray[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            newArray[p + i] = b[i];
        }
        for (int i = p; i < n; i++) {
            newArray[m + i] = a[i];
        }

        ouputArray(newArray,newArray.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        do {
            System.out.print("Nhap vao so phan tu cua mang(a,n) (n>0): ");
            n = sc.nextInt();
        } while (n < 0);

        int a[] = new int[n];
        inputArray(a,n);
        System.out.print("Phan tu cua mang(a,n) la: ");
        ouputArray(a,n);
        do {
            System.out.print("Nhap vao so phan tu cua mang(b,m) (m>0): ");
            m = sc.nextInt();
        } while (m < 0);

        int b[] = new int[m];
        inputArray(b,m);
        System.out.print("Phan tu cua mang(b,m) la: ");
        ouputArray(b,m);

        int p;
        do {
            System.out.print("Nhap vao so nguyen p (0<=p<n): ");
            p = sc.nextInt();
        } while (p < 0 || p>n);
        System.out.print("Mang sau khi chen la: ");
        insertArray(a,n,b,m,p);

        sc.close();
    }
}
