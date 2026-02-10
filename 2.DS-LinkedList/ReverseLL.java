public class ReverseLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    void insertion(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void reverse(){
        Node curr = head;
        Node prev = null;
        while(curr.next!=null){
            Node next = curr.next;
            prev = curr;
            
        }
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp +"-> "+temp.data+" -> "+temp.next);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        OddEvenNode obj = new OddEvenNode();
        obj.insertion(1);
        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.insertion(5);
        obj.display();
    }
}
