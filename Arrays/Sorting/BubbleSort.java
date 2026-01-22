class BubbleSort
{
    public static void main(String args[]){
        int arr[] = {71,31,34,89,40};
        System.out.println("Before BubbleSorting:- ");
        for(int i=0;i<arr.length;i++){  
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Bubblesort algo
        for(int i = 0; i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) //current element agar next element se bada hai toh swap varna nhi
                { 
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After BubbleSorting:- ");
        for(int i=0;i<arr.length;i++){  
            System.out.print(arr[i]+" ");
        }
    }
}