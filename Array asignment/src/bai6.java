import java.util.Scanner;

public class bai6 {
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



    public static void sortArray(int a[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void insertArray(int a[],int n,int x){
        int[] newArray = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArray[i] = a[i];
        }
        for (int i = n; i < n+1; i++) {
            newArray[n] =  x;
        }
        sortArray(newArray,newArray.length);
        ouputArray(newArray,newArray.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so phan tu cua mang(a,n) (n>0): ");
            n = sc.nextInt();
        } while (n < 0);

        int a[] = new int[n];
        inputArray(a,n);
        System.out.print("Phan tu cua mang(a,n) la: ");
        ouputArray(a,n);
        int x;
        System.out.print("Nhap vao so phan tu x: ");
        x = sc.nextInt();
        System.out.println("Sap xep mang a theo thu tu tang dan la:");
        insertArray(a,n,x);
        sc.close();
    }
}
