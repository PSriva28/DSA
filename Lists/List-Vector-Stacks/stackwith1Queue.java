// package 3.Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class stackwith1Queue {
    Queue<Integer> q1;
    stackwith1Queue(){
        q1 = new LinkedList<>();
    }

    void push(int x){
        //1- add the new number into the queue
        //2- the rest elements from below will be popped and then again push into the same q1, will happen till the new x added
        q1.offer(x);
        for(int i = 0;i<q1.size()-1;i++){
            q1.offer(q1.poll());
        }
        System.out.println("Pushed: "+q1.offer(x));
    }
    int pop(){
        System.out.println("Popped: "+q1.poll());
        return q1.poll();
    }
    int top(){
        System.out.println("Topped: "+q1.peek());
        return q1.peek();
    }
    boolean empty(){
        System.out.println("Emptied: "+q1.isEmpty());
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        stackwith1Queue obj = new stackwith1Queue();
        obj.push(12);
        obj.push(24);
        obj.push(36);
        obj.top();
        obj.pop();
        obj.top();
    }
}

