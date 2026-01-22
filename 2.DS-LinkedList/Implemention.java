//phele insertion banayege
public class Implemention {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    
    void insertion(int val){
        Node newnode = new Node(val);
        //1-
        if(head == null){
            System.out.println("head is null.");
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    
    
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+" -> "+temp);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Implemention obj = new Implemention();
        obj.insertion(12);
        obj.insertion(13);
        obj.insertion(123);
        obj.display();
    }
}
