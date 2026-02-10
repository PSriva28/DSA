import java.util.Stack;

public class lengthStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(33);
        st.push(43);
        st.push(53);
        st.push(63);
        st.push(73);
        st.push(83);
        System.out.println("Size of Stack With size() : "+st.size());
        //without using size()
        int count =0;
        while(!st.isEmpty()){
            st.pop();
            count++;
        }
        System.out.println("Size of Stack Without size() : "+count);
    }
}
