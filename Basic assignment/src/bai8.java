public class bai8 {

    public static boolean Check (int n){
        int tg=n;
        int temp=0;
        while(n>0){
            temp = temp*10 + n%10;
            n=n/10;
        }
        if(temp==tg) return true;
        return false;
    }

    public static void main(String[] args) {
        //ý a
        System.out.println("Ý a");
        for(int i=100000;i<=999999;i++){
            if(Check(i)){
                System.out.println(i +"\n");
            }
        }

        //Ý b
        System.out.println("Ý b");
        for(int i=100000;i<=999999;i++){
            if(Check(i)){
                int sum =0;
                int temp= Math.abs(i);
                while (temp > 0) {
                    sum += temp%10;
                    temp/=10;
                }
                if(sum==10){
                    System.out.println(i +"\n");
                }
            }
        }

    }
}
