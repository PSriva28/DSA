class SelectionSort
{
    public static void main(String args[]){
        int arr[] = {32,45,23,56,7};
        System.out.println("Before SelectionSort:- ");
        for(int i  = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        //selection sort begins
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest= j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[smallest];
            arr[smallest] = temp;
        }
        System.out.println("After SelectionSort:- ");
        for(int i  = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//dry run 
// i = 0; smallest=i=0
//         j=i+1           arr[j]      comparison      smallest
//         1               45             32>45            no
//         2               23             32>23            yes, smallest = 2
//         3               56             23>56            no
//         4               7              23>7             yes, smallest = 4

//     j ke loop bahar we will swap , 0 with 4th, [7, 45, 23, 56, 32]

// i=1, smallest= i=1
//         j=i+1 = 1+1=2   arr[j]      comparison      smallest
//         2               23             45>23              yes, smallest=2
//         3               56             23>56              no
//         4               32             23>32              no

//     j ke loop bahar we will swap 1 with 2. [7,23,45,56,32]

// i=2, smallest = i=2
//         j=i+1           arr[j]      comparison      smallest
//         3               56              56>45               no
//         4               32              45>32               yes, smallest=4

//     j ke loop ke bahar we will swap, 2 with 4. [7,23,32,56,45]

// i=3 smallest=i=3
//         j=i+1           arr[j]      comparison      smallest
//         4               45              56>45           yes smallest=4
    
//     j ke loop ke bahar we will swap, 3 with 4. [7,23,32,45,56]