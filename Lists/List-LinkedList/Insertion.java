// package 2.DS-LinkedList;
// import java.util.*;
public class Insertion {
    class Node{
        int data;
        Node nextnode;
        Node(int data){
            this.data = data;
            this.nextnode =null;
        }
    }

    //Insertion at front; 
    Node head; //Starting point of ll. 
    public void InsertAtFront(int data){
        Node newnode = new Node(data);
        newnode.nextnode = head;
        head= newnode;
    }

    public void InsertAtEnd(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.nextnode!=null)
        {
            temp = temp.nextnode;
        }
        temp.nextnode = newnode;
    }
    void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.nextnode;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Insertion newll = new Insertion();
        newll.InsertAtFront(78);
        newll.InsertAtFront(56);
        newll.InsertAtEnd(67);
        newll.printll();
    }
}
