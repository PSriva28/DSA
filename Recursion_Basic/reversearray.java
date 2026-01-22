class reversearray{
    public static void revArray(int arr[], int n){
        reverse(arr, 0, n-1);
    }
    public static void reverse(int arr[], int i, int j){
        if(i>=j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
        reverse(arr, i+1, j-1);
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40};
        revArray(arr,4);
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}