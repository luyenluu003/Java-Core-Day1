import java.util.Scanner;

public class bai8 {

    public static void input(int A[][],int m,int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("["+i+"]["+j+"]: ");
                A[i][j] = sc.nextInt();
            }

        }
    }

    public  static void output(int A[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public static void tich2MaTran(int A[][],int m,int n ,int B[][],int k){
        int C[][] = new int[m][k];
        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++){
                C[i][j]=0;
                for(int q=0;q<n;q++){
                    C[i][j] += A[i][q]*B[q][j];
                }
            }
        }
        output(C,m,k);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,k;
        do {
            System.out.print("Nhap vao phan tu m (m>0): ");
            m = sc.nextInt();
        } while (m < 0);
        do {
            System.out.print("Nhap vao phan tu n (n>0): ");
            n = sc.nextInt();
        } while (n < 0);
        do {
            System.out.print("Nhap vao phan tu k (k>0): ");
            k = sc.nextInt();
        } while (k < 0);
        int A[][] = new int[m][n];
        int B[][] = new int[n][k];
        System.out.println("Nhap vao ma tran cac so nguyen A cap m*n: ");
        input(A,m,n);
        System.out.println("Ma tran cac so nguyen A cap m*n la: ");
        output(A,m,n);
        System.out.println("Nhap vao ma tran cac so nguyen B cap n*k: ");
        input(B,n,k);
        System.out.println("Ma tran cac so nguyen B cap n*k la: ");
        output(B,n,k);
        System.out.println("Tich 2 ma tran la: ");
        tich2MaTran(A,m,n,B,k);
        sc.close();
    }
}
