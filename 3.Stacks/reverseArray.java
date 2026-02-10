import java.util.Stack;
//Approach - 
//Step 1 = push karegeg element by element into a new initialise stack
//Step 2 = overwrite the values with popping values of the stack 
//Step 3 = display the array;

public class reverseArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        Stack<Integer> st = new Stack<>();
        for (int i = 0;i<array.length;i++){
            st.push(array[i]);
        }
        for(int i = 0;i<array.length;i++){
            array[i] = st.pop();
        }
        for(int i =0;i<array.length;i++)
        {
            System.out.println(array[i]);
            
        }
    }
}
