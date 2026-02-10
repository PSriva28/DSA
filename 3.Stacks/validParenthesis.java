import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        String s = "{(()])}";
        Stack<Character> st = new Stack<>();
        for (char i : s.toCharArray()){
            if(isBracketsOpen(i)){
                st.push(i);
            }else{
                if(st.isEmpty()){ //or st.size() == 0
                    System.out.print(false);
                    return;
                }
                else if(areBracketsMatching(st.peek(), i)){
                    st.pop();
                }
                else {
                    System.out.print(false);
                    return;
                }
            }

        }
        System.out.print(st.isEmpty());
    }

    private static boolean isBracketsOpen(char c){
        switch (c) {
            case '(':
            case '{':
            case '[' :
                return true;
            default:
                return false;
        }
    }
    private static boolean areBracketsMatching(char c, char d){
        if(c == '(' && d == ')'){
            return true;
        }
        else if(c == '{' && d == '}'){
            return true;
        }
        else if(c == '[' && d == ']'){
            return true;
        }
        else{
            return false;
        }
    }
}
