public class bai9 {
    public static boolean Check (int n){
        int tg=n;
        int temp=0;
        while(n>0){
            temp = temp*10 + n%10;
            n=n/10;
        }
        return temp==tg;
    }

    public static boolean checkAll(int n){
        while(n>0){
            int digit = n%10;
            if(digit !=0 && digit !=6 && digit !=8 ){
                return false;
            }
            n=n/10;
        }
        return true;
    }

    public static boolean checkSum(int n){
        int sum =0;
        while (n > 0) {
            sum += n%10;
            n/=10;
        }
        return sum%10==0;
    }

    public static void main(String[] args) {
        for(int i=1000000;i<=999999999;i++){
            if (Check(i) && checkSum(i) && checkAll(i)) {
                System.out.println(i);
            }
        }
    }
}
