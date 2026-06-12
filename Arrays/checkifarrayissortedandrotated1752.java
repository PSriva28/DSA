class checkifarrayissortedandrotated1752{
    public static void main(String args[])
    {
        // int arr[] = {1,2,3,4,5,6};
        // int arr[] = {5,4,6,7,8};
        int arr[] = {3,4,5,1,2};

        // //Approach 1- if the array is already sorted then 
        // for(int i =1;i<arr.length;i++){
        //     // checking if the previous element is greater than the current; 
        //     if(arr[i] < arr[i-1]){ 
        //         System.out.println("false");
        //     }
        // }
        // System.out.println("true");

        // Approach 2 - if the array is not sorted then. 
        int count =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > arr[(i+1)%arr.length])
            
                count++;
                System.out.println(count);
        }
        System.out.println(count<=1);
    }
}