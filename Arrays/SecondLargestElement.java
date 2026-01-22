package Arrays;

import java.util.Arrays;
public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {7,5,6,8,9,2};
        //1- first through in-built sorting method. 
        Arrays.sort(arr);
        System.out.println("Second Largest Element: "+arr[arr.length-2]);

        //2-second way
        int largest = 0, secondLargest=0;
        if(arr[0]>arr[1]){
            largest = arr[0]; //assuming the first element is the largest of the array;
            secondLargest = arr[1]; 
        }
        else{
            largest = arr[1];
            secondLargest = arr[0];
        }

        for(int i = 2; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i]; 
            }
            else if(arr[i]>secondLargest && arr[i] !=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element : "+secondLargest);
    }
}
