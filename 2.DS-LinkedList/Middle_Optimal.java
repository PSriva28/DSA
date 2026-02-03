// import org.w3c.dom.Node;

public class Middle_Optimal {
    class Node {
        Node next ;
        int data;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    Node head;//Global variable
    void insertion(int data){
        Node newnode= new Node(data);
        if(head == null){
            head= newnode; //if head is null, then newnode is head only and return
            return;
        }
        Node temp = head; // storing head in temp, so that we don't lose the head; 
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        
    }
    Node optimalapp(){
        Node slow = head; //starts both at head
        Node fast = head; //starts both at head
        while(fast!=null && fast.next!=null){
            slow = slow.next;  //moves one step ahead
            fast = fast.next.next; // moves two step ahead;
        }
        return slow;
    }
    int optimalappElement(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    //Displaying Linked List
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp +" -> "+temp.data+" -> "+temp.next);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Middle_Optimal obj = new Middle_Optimal();
        obj.insertion(12);
        obj.insertion(24);
        obj.insertion(36);
        obj.insertion(48);
        obj.insertion(60);
        Node result = obj.optimalapp();
        System.out.println("Middle node = "+result);
        int res = obj.optimalappElement();
        System.out.println("Middle Element = "+res);
        obj.display();
    }
}
