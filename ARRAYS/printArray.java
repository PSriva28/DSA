//Topics Covered :- Initialising of array elements and printing array elements + Scanner Class
import java.util.*;

public class printArray {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        //initialising array elements
        int arr[] = new int[7];
        System.out.println("Enter the element: ");;
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //display array elements
        System.out.print("The array element is: [");
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length-1)
            System.out.print(", ");
        }
        System.out.print("]");
        sc.close();

    }
}