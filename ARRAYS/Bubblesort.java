//Topics covered :- Array + functions + BubbleSort + Scanner

import java.util.*;
public class Bubblesort {

    public static void main(String []args){

        Scanner sc =new Scanner(System.in);
        int size = 5;
        int arr[] = readArray(sc, size);
        ascSort(arr);
        // descSort(arr);
        printArray(arr);
    }
    public static int[] readArray(Scanner sc, int size){
        int arr[] = new int[size];
        System.out.println("Enter array elements:");{
            for(int i=0; i<size;i++){
                arr[i] = sc.nextInt();
            }
        }
        return arr;
    }
//sorting using bubblesort in ascending order
    public static int[] ascSort(int arr[]){
        for(int i = 0;i<arr.length - 1;i++){
            boolean swap = false;
            for(int j=0; j<arr.length -1 -i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }     
            }
            if(!swap)
                {
                    return arr;
                }
        }
        return arr;
    }
//sorting using descending order using BubbleSort

    public static int[] descSort(int arr[]){
        for(int i=0;i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArray(int arr[]){
        System.out.print("Array : [");
        for (int i= 0 ;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }
         System.out.print("]");
    }
}
