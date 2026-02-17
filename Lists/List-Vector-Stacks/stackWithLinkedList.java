// package 3.Stacks;

// using stack with linked list, one can insert from the tail as well as the head also;
// from tail - insertion/deletion will take O(n) as we have traverse till the last node and then insert/delete;
// from head - it will take O(1), as we just have to change the links.
 
//a part

// import java.lang.classfile.instruction.ReturnInstruction;

public class stackWithLinkedList {
    static class Node{ //<-------------------------------------NODE CLASS BEGINS
        int val;Node next;
        Node(int val){ //<------------------------------Node constructor
            this.val = val;
            this.next= null;
        }
    }//------------------------------------------------->NOODE CLASS ENDS

    static class Stack{//<--------------------------------------STACK CLASS BEGINS
        private Node top;
        Stack(){//---------------------------------------Stack constructor
            top = null;
        }
        void insertion(int val){//-----------------------1- insertion
            Node newnode = new Node(val);
            newnode.next = top;//------------------------mtlb purane top ka address store krna newnode ke address mai fir top mai newnode dalna
            top = newnode;
            System.out.println(top+" -> "+top.val+" -> "+top.next);
            return;
        }

        int removal(){//---------------------------------2- removal
            if(isEmpty()){
                return -1;
            }
            int poppedval = top.val;
            top = top.next;
            return poppedval;
        }

        int peek(){//------------------------------------3- top element
            if(isEmpty()){
                return -1;
            }
            return top.val;
        }

        boolean isEmpty(){//-----------------------------4- checking if stack is empty
            return top == null;
        }
    }//-------------------------------------------------->STACK CLASS ENDS
    public static void main(String[] args) {
        Stack st = new Stack();
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
