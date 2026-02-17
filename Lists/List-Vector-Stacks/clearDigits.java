import java.util.Stack;

public class clearDigits {
    public static void main(String[] args) {
        String s = "Hi@2347324@alksd";
        s = s.replaceAll("[^A-Za-z0-9]","");
        if(s.matches("[A-Za-z]+")){
            return;
        }
        else if(s.matches("[0-9]+")){
            return;
        }
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(Character.isLetter(i)){
                st.push(i);
            }
            else if(Character.isDigit(i)){
                st.pop();
            }
        }
        StringBuilder sb =  new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
