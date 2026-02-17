public class SearchElement {
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

    //searching element
    boolean search(int k){
        Node temp = head;
        boolean res = false;
        while(temp.next!=null){
            temp = temp.next;
            if(temp.data == k){
                res = true;
                break;
            }
        }
        return res;
    }



    //display
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp + " -> "+temp.data+" -> "+temp.next);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SearchElement obj = new SearchElement();
        obj.insertion(100);
        obj.insertion(200);
        obj.insertion(300);
        obj.display();
        boolean result = obj.search(20);
        System.out.println("Result - "+ result);
    }
}
