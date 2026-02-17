// package 3.Stacks;
import java.util.Stack;
public class iImplementation1 {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(32);
        System.out.println(stack);
        stack.push(23);
        System.out.println(stack);
        stack.push(100);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println("TOP-"+stack.peek());
        System.out.println(stack.isEmpty());

    }
}
