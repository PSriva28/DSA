// package 3.Stacks;
public class stackwithArray {
    
    int top = -1; // as the list is empty, array starts basically from 0 so before 0 is -1;
    int arr[] = new int[4];
    void insertion(int x){ // insertion happens with push method which takes constant time i.e. O(1);

        //----test case 1 -----
        if(top == arr.length -1){
            System.out.println("Stack Overflow error:- ");
            return;
        }
        top++;
        arr[top] = x; 
        // System.out.println(arr[top]);

    }
    void deletion(){ //deletion happens with pop method which takes contant time i.e. O(1);
        //-------test  case 2------
        if(top == -1){
            System.out.println("No element found to be popped.");
            return;
        }
        
        System.out.println("deleted element - "+ arr[top--]); // we simply ignore the last element of the stack, it is present in the memory, however after we push again it will overwrite the value;
    }
    int peeking(){ 
        System.out.println("Top element:- "+arr[top]);
        return arr[top];
    }

    void print(){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        stackwithArray obj = new stackwithArray();
        obj.insertion(1);
        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.print();
        obj.deletion();
        obj.peeking();
    }
}
