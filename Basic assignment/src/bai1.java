import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n:");
        int n = sc.nextInt();
        //ý a
        int suma =0;
        if(n%2==0){
            for(int i=2;i<=n;i+=2){
                suma+=i;
            }
        }else{
            for(int i=1;i<=n;i+=2){
                suma+=i;
            }
        }
        System.out.println("Ý a: tổng S= " + suma);
        // ý b
        double sumb=0.0;
        for(int i=1;i<=n;i++){
            sumb += 1.0/i;
        }
        System.out.println("Ý b: tổng S= " + sumb);

        sc.close();
    }
}
