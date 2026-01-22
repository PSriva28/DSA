package Arrays;

import java.util.Arrays;
public class largestElement {
    public static void main(String args[]){
        int arr[] = {5,12,-5,0,41,20}; 
        Arrays.sort(arr); // it will sort the arr to {-5,0,5,12,20,40}
        System.out.println("Largest element: "+arr[arr.length-1]);

        System.out.println("Second Approach");
        int max= arr[0]; //assuming that the max is the first element of array;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest Element: "+max);
    }
}
