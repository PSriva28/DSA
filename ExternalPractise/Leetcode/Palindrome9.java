public class Palindrome9 {
    public static void main(String[] args) {
        int x = 121;
        int num = x;
        int rev = 0;
        boolean result = false;
        if(x<0){
            result = false;
        }
        while(x>0){
            int last = x%10;
            rev = rev*10+last;
            x=x/10;
        }
        if(num==rev){
            result = true;
        }
        System.out.print(result);
    }
}
