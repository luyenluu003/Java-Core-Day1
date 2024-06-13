import java.util.Scanner;

public class bai3 {

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

    public static void countFrequency(int[] a, int n){
        int[] freq= new int[n];
        boolean[] counted= new boolean[n];

        for(int i=0;i<n;i++){
            freq[i]=0;
            counted[i]=false;
        }

        for(int i=0;i<n;i++){
            if(counted[i]==true) continue;
            int count =1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    counted[j]=true;
                }
            }
            freq[i]=count;
        }

        for (int i = 0; i < n; i++) {
            if (counted[i] == false) {
                System.out.println("Phan tu " + a[i] + " xuat hien " + freq[i] + " lan.");
            }
        }

        int maxCount = freq[0];
        int maxElement = a[0];
        for (int i = 1; i < n; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                maxElement = a[i];
            }
        }

        System.out.println("Phan tu co so lan xuat hien nhieu nhat la: " + maxElement + " (" + maxCount + " lan)");
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
        countFrequency(a,n);

        sc.close();
    }
}
