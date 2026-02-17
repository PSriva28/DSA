import java.util.Stack;
//Approach- 
// Step1 - convert the string into character array using toCharArray() method
// Step2 - initialize a stack and push each character into that stack
// Step3 - run a loop from 0 to character array length, and overwrite the values with each popping values;
// Step4 - to convert the newly formed character array into string using new String() method;


public class reverseString {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "Hi Hello";
        char ch[] = s.toCharArray();

        for(char i : ch){
            st.push(i);
        }

        for(int i = 0;i<ch.length;i++){
            ch[i] = st.pop();
        }
        String rev = new String(ch);
        System.out.println(rev);
    }
}
