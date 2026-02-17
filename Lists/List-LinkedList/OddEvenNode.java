public class OddEvenNode {
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

    Node sorting(){
        Node odd = head;
        Node even = head.next;
        Node evenhead = even;
        while(even!= null && even.next!=null){
            odd.next = even.next;
            odd  = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
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
        Node res = obj.sorting();
        System.out.println("After even-odd sorting :- ");
        obj.display();
    }
}

