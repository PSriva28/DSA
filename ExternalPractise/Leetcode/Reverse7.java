public class Reverse7 {
    public static void main(String[] args) {
        int x = 1534236469;
        int reverse=0;
        int sign = x<0?-1:1;
        x = Math.abs(x);
        while (x > 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            System.out.println(reverse);
            x = x / 10;
        }
        System.out.println(reverse*sign);
    }
}
