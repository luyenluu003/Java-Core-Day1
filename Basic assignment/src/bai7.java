public class bai7 {
    public static void main(String[] args) {
        System.out.println("So nguyen to chua toan so le co 6 chu so la:");
        for(int i = 100000; i <= 999999; i++) {
            boolean check = true;
            int temp = i;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    check = false;
                    break;
                }
                temp /= 10;
            }
            if (check) {
                System.out.print(i + "\n");
            }
        }
    }
}
