import java.util.*;
public class printArrayFunc {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int len = 10;
        int arr[] = readArray(sc,len);
        printArray(arr);
        sc.close();
    }

    public static int[] readArray(Scanner sc, int len){
       int arr[] = new int[len];
       for(int i=0;i<len;i++){
        System.out.println("Enter array elements:");
        arr[i] = sc.nextInt();
       }
       return arr;
    }
    public static void printArray(int arr[]){
        System.out.print("Array = [");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i< arr.length-1);
            {System.out.print(", ");}
        }
        System.out.print("]");
    } 
}