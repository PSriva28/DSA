import java.util.*;
public class stackWithQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public stackWithQueues(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    void insertion(int x){

        //1 - 2queue mai push karo elements
        //2 - push elements from queue1 into queue2 element by element
        //3 - swap elements from queue 1 and queue 2

        q2.offer(x); //1

        while(!q1.isEmpty()){ //2
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1; //3
        q1 = q2;
        q2 = temp;
    }
    int removal(){
        return q1.poll();
    }

    int top(){
        return q1.peek();
    }

    boolean isEmpty(){
        System.out.println(q1.isEmpty());
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        stackWithQueues obj = new stackWithQueues();
        obj.insertion(12);
        obj.insertion(24);
        obj.insertion(36);
        obj.top();
        obj.removal();
        obj.top();
    }
}
