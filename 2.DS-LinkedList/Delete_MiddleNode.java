import org.w3c.dom.Node;

public class Delete_MiddleNode {
    //edge cases kya hoge = sirf head hi hua. toh usse uda dena hai 
    //if head= null, throw error
    //if 2 elements, then delete the second one
    //handling odd and even;
    class ListNode {
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
            this.next =null;
        }
    }
    ListNode head; // global head
    void insertion(int data){
        ListNode newnode = new ListNode(data);
        if(head == null){
            head= newnode; //if head is null, then newnode is head only and return
            return;
        }
        ListNode temp = head; // storing head in temp, so that we don't lose the head; 
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    

    //---------------------------Deleting Middle Node--------------------------------------------
    void deleteMiddleNode(){
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return;
    }
    
    //Displaying Linked List
    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp +" -> "+temp.val+" -> "+temp.next);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Delete_MiddleNode obj = new Delete_MiddleNode();
        obj.insertion(12);
        obj.insertion(24);
        obj.insertion(36);
        obj.insertion(48);
        obj.insertion(60);
        obj.display();
        obj.deleteMiddleNode();
        System.out.println("After deleting the Middle node -:");
        obj.display();
    }
}
