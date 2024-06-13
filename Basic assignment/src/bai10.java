public class bai10 {

    public static boolean Check(int n){
        int tg=n;
        int temp =0;
        while(n>0){
            temp= temp*10+n%10;
            n=n/10;
        }
        if(tg==temp)return true;
        return false;
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

    public static boolean checkAllSNT(int n){
        while(n>0){
            int digit = n%10;
            if(digit !=2 && digit !=3 && digit !=5 && digit !=7){
                return false;
            }
            n/=10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Cac chu so thoa man dieu kien la:");
        for (int i = 7000000; i <= 9999999; i++) {
            if (checkSNT(i) && Check(i)) {
                if (checkAllSNT(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
