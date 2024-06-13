import java.util.Scanner;

public class bai10 {

    public static void input(int A[][],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("["+i+"]["+j+"]: ");
                A[i][j] = sc.nextInt();
            }

        }
    }

    public  static void output(int A[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public static void tongDuongCheoChinh(int A[][],int n){
        int sum =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=A[i][j];
                }
            }
        }
        System.out.print("Tong duong cheo chinh la:"+sum);
    }

    public static void tongDuongCheoPhu(int B[][],int n){
        int sum =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-1-j){
                    sum+=B[i][j];
                }
            }
        }
        System.out.print("\nTong duong cheo phu la:"+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so phan tu cua ma tran A kich thuoc n*n (n>0): ");
            n = sc.nextInt();
        } while (n < 0);

        int A[][] = new int[n][n];
        System.out.println("Nhap vao ma tran cac so nguyen A cap n*n: ");
        input(A,n);
        System.out.println("Ma tran cac so nguyen A cap n*n la: ");
        output(A,n);
        tongDuongCheoChinh(A,n);
        tongDuongCheoPhu(A,n);

        sc.close();
    }
}
