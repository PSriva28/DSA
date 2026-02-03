public class Middle_Brute {
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
    
    //Middle of the linked list nikalna hai - brute force and that to data nikalna hai if node then follow the next steps
    int middleUsingBrute(){
        Node temp = head;
        int count = 0;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int mid = count/2 + 1;
        while(temp!=null && mid>0){
            mid = mid -1;
            if(mid==0) break;
            temp = temp.next;
            // break;
        }
        return temp.data;
    }
    
    Node middleNode()
    {
        Node temp = head;
        int count = 0;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int mid = count/2 + 1;
        while(temp!=null && mid>0){
            mid = mid -1;
            if(mid==0) break;
            temp = temp.next;
            // break;
        }
        return temp;
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
        Middle_Brute obj = new Middle_Brute();
        obj.insertion(12);
        obj.insertion(24);
        obj.insertion(36);
        obj.insertion(48);
        obj.insertion(60);
        int res= obj.middleUsingBrute();
        System.out.print("Middle element "+ res +" - ");
        Node noderes= obj.middleNode();
        System.out.println("Middle element "+ noderes);
        obj.display();
    }
}
