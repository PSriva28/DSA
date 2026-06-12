class removeDuplicate26{
    public static void main(String args[]){
        int arr[] = {5,4,3,3,2,1,1};
        //Approach:- do pointers lege -> i jo ki iterate hota rahega har baar, j jo ki sirf tabhi aage bhadega jab usse unique element milega -> fir purani vali jagah pr new elemnt keep karo
        int j = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] != arr[i-1]) //checking if the previous element is same as current;
            {
                j = j+1;
                arr[j-1] = arr[i];
            }
        }
        System.out.println(j);
    }
}