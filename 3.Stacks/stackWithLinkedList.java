// package 3.Stacks;

// using stack with linked list, one can insert from the tail as well as the head also;
// from tail - insertion/deletion will take O(n) as we have traverse till the last node and then insert/delete;
// from head - it will take O(1), as we just have to change the links.
 
public class stackWithLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node top;
        void Insertionfromhead(int x){
            Node newnode = new Node(x);
            newnode.next  = top;
            top = newnode;
        }
        Node head;
        void insertionFromTail(int x){
            Node newnode = new Node(x);
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = top;
            top = newnode;
        }
        void deletionfromhead(){
            
        }
    }
}
