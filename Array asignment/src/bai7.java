import java.util.Scanner;

public class bai7 {
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

    public static void longOutput(int a[] ,int n){
        int maxLength = 1;
        int startPos = 0;
        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                currentLength++;
                if (currentLength > maxLength || (currentLength == maxLength && currentStart < startPos)) {
                    maxLength = currentLength;
                    startPos = currentStart;
                }
            } else {
                currentStart = i;
                currentLength = 1;
            }
        }

        // In ra kết quả
        System.out.println("Duong chay dai nhat o vi tri " + (startPos + 1) + " voi do dai la " + maxLength);

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
        longOutput(a,n);
        ouputArray(a,n);
        sc.close();

    }
}
