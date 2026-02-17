// package 3.Stacks; 16.02.2026
import java.util.Stack;
public class MinStack {

    Stack<Integer> s1;
    Stack<Integer> s2;
    MinStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    void push(int x){
        s1.push(x);
        if(s2.isEmpty() || x <= s2.peek()){
            s2.push(x);
        }
    }
    int pop(){
        int popped = s1.pop();
        if(popped == s2.peek()){
            s2.pop();
        }
        System.out.println("Popped -"+popped);
        return popped;
    }
    int peek(){
        System.out.println("Peaked -"+s1.peek());
        return s1.peek();
    }
    int getMin(){
        System.out.println("Mini Ele -"+s2.peek());
        return s2.peek();
    }
    void display(){
        System.out.println(s1);
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);obj.push(13);
        obj.push(3);
        obj.push(-10);
        obj.display();
        obj.peek();
        obj.getMin();
        obj.pop();
        obj.display();
        obj.getMin();
    }
}
