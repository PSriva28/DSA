// package 3.Stacks;

// using stack with linked list, one can insert from the tail as well as the head also;
// from tail - insertion/deletion will take O(n) as we have traverse till the last node and then insert/delete;
// from head - it will take O(1), as we just have to change the links.
 
//b part

public class stackWithLinkedListTail {
    static class Node{ //<-------------------------------------NODE CLASS BEGINS
        int val;Node next;
        Node(int val){ //<------------------------------Node constructor
            this.val = val;
            this.next= null;
        }
    }//------------------------------------------------->NOODE CLASS ENDS
        private Node head;
        int insertion(int val){//-----------------------1- insertion
            Node newnode = new Node(val);
            Node temp = head;
            if(head == null){
                head = newnode;
                return newnode.val;
            }
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
            return newnode.val;
        }

        int removal(){//---------------------------------2- removal
            if(head == null){
                return -1;
            }
            if(head.next == null){
                int value = head.val;
                head = null;
                return value;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            int value = temp.next.val;
            temp.next = null;
            return value;
        }

        int peek(){//------------------------------------3- top element
            if(head == null){
                return -1;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            int value = temp.val;
            return value;
        }

        boolean isEmpty(){//-----------------------------4- checking if stack is empty
            return head == null;
        }
    public static void main(String[] args) {
        stackWithLinkedListTail st = new stackWithLinkedListTail();
        System.out.println("Top Element-"+st.peek());
        System.out.println("Stack Empty? "+st.isEmpty());
        st.insertion(1);
        st.insertion(2);
        st.insertion(3);
        System.out.println("Top Element-"+st.peek());
        System.out.println("Removed Element-"+st.removal());
        System.out.println("Removed Element-"+st.removal());
        System.out.println("Top Element-"+st.peek());
        System.out.println("Stack Empty? "+st.isEmpty());
    }
}
