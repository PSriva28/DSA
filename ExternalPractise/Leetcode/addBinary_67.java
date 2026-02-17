package ExternalPractise.Leetcode;

public class addBinary_67 {
    public static void main(String[] args) {
        String a = "101";
        String b = "100";

        StringBuilder res = new StringBuilder(); //To store the result. why do we use StringBuilder cause we store dynamic increasing string
        int i = a.length() -1 ; // to store the length of the string for looping purpose;
        int j = b.length() -1 ; // to store the length of the string 2 for looping purpose;
        int carry = 0; 
        while(i>=0 || j >=0 || carry == 1){
            int sum = carry;
            if(i>=0){
                sum += a.charAt(i) - '0'; //('49/48' - '48' will result 1 or 0 converted into integer)
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }
            res.append(sum%2);
            carry = sum/2;
        }
        System.out.print(res.reverse().toString());
    }
}
