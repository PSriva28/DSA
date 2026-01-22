// package 2.DS-LinkedList;

public class Deletion {
    class Node{
        Node nextNode;
        int data;
        Node(int data){
            this.data = data;
            this.nextNode = null;
        }
    }
    Node head;
    void insertion(int data, int position){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        if(position == 1){
            newnode.nextNode = head;
            newnode = head;
        }
        Node temp = head;
        for(int i =1;i<position-1;i++){
            temp = temp.nextNode;
        }
        newnode.nextNode = temp.nextNode;
        temp.nextNode = newnode;
    }
    void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.nextNode;
        }
        System.out.println();
    }
    //Deletion///////////
   void deletion(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // delete first node
        if (position == 1) {
            head = head.nextNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {
            if (temp.nextNode == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.nextNode;
        }

        // delete node
        if (temp.nextNode != null) {
            temp.nextNode = temp.nextNode.nextNode;
        }
}

    public static void main(String[] args) {
        Deletion obj = new Deletion();
        obj.insertion(12, 1);
        obj.insertion(24, 2);
        obj.insertion(48, 3);
        obj.display();
        obj.deletion(2);
        System.out.println("After deletion:-");
        obj.display();
    }
    
}
