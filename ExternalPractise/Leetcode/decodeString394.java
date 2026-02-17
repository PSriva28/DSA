package ExternalPractise.Leetcode;

import java.util.Stack;

class decodeString394 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        char ch[] = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c : ch){
            if(c!=']'){
                st.push(c);
            }
            
        }

    }


}
