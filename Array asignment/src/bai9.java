import java.util.Scanner;

public class bai9 {

    public static void input(int A[][],int n,int m){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("["+i+"]["+j+"]: ");
                A[i][j] = sc.nextInt();
            }
        }
    }

    public static void output(int A[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public static void arrange(int A[][],int n,int m){
        int c[]= new int [m*n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[k++]=A[i][j];
            }
        }

        for(int i=0;i<n*m;i++){
            for(int j=i+1;j<n*m;j++){
                if(c[i]>c[j]){
                    int temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        int q=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j]=c[q++];
            }
        }
        System.out.println("Ma tran A sau khi sap xep la:");
        output(A,n,m);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        do {
            System.out.print("Nhap vao phan tu n (n>0): ");
            n = sc.nextInt();
        } while (n < 0);
        do {
            System.out.print("Nhap vao phan tu m (m>0): ");
            m = sc.nextInt();
        } while (m < 0);

        int A[][] = new int[n][m];
        System.out.println("Nhap vao ma tran cac so nguyen A cap n*m: ");
        input(A,n,m);
        System.out.println("Ma tran cac so nguyen A cap n*m la: ");
        output(A,n,m);
        arrange(A,n,m);
    }
}
