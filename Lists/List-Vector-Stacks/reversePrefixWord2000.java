// package 3.Stacks;

import java.util.Stack;

public class reversePrefixWord2000 {
    public static void main(String[] args) {
        String word = "wxyzxe";char ch = 'z';
        
        int index = word.indexOf(ch); //1- find the index of the char ch, if not find, return the word itself
        if(index == -1){
            System.out.print(word);
            return;
        }

        Stack<Character> st = new Stack<>();
        // Stack<Character> s2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <=index ; i++){
            st.push(word.charAt(i));
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        //add remaining characters
        for(int i = index+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }

        // // StringBuilder sb = new StringBuilder();
        // for(char i : s2){
        //     sb.append(i);
        // }
        System.out.println(sb.toString());
    }
}
