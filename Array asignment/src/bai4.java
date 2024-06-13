import java.util.Scanner;

public class bai4 {

    public static void inputArray(int a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
    }

    public static void ouputArray(int a[],int n){

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    public static boolean checkSNT(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int Find(int[] a,int n,int X) {
        int close = a[0];
        for(int i=1;i<n;i++){
            if(checkSNT(a[i])){
                if(Math.abs(a[i]-X)<Math.abs(close-X)){
                    close = a[i];
                }
            }
        }
        return close;
    }
    public static int FindIndex(int[] a,int n,int num){
        for(int i=0;i<n;i++){
            if(a[i]==num){
                return i+1;
            }
        }
        return -1;
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
        System.out.print("Phan tu cua mang la: ");
        ouputArray(a,n);
        System.out.println("Nhap vao X : ");
        int X =sc.nextInt();

        int Fclose = Find(a,n,X);
        int index = FindIndex(a,n,Fclose);

        System.out.println("Vi tri so nguyen to gan nhat voi "+X+" trong mang la : "+index);

        sc.close();
    }
}
