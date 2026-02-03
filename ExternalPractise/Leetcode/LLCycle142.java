package ExternalPractise.Leetcode;


public class LLCycle142 {
    class Node{
        int data;
        Node next;
        Node(int data){ //parameterised constructor
            this.data = data;
            this.next = null;
        }
    }
    Node head; //Global variable
    //insertion of Elements in linked list
    void insertion(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    

    Node detectCycle(){ 
    Node slow = head;
    Node fast = head;
    Node res = null;
    while(fast != null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow.data == fast.data){
            res = slow;
            System.out.println("Cycle detected :) ");
            return res;
        }
    }
    System.out.println(" No Cycle detected :(");
    return res;
}
    
    
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp + " -> "+temp.data+" -> "+temp.next);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LLCycle142 obj = new LLCycle142();
        obj.insertion(100);
        obj.insertion(200);
        obj.insertion(300);
        obj.insertion(200);
        obj.insertion(300);
        obj.display();
        Node res = obj.detectCycle();
        System.out.println(res);

    }
}
