public class SelectionSortExample {
    // Selection Sort Method
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int iMin = i;
            // Find the index of the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[iMin]) {
                    iMin = j;
                }
            }
            // Swap arr[i] and arr[iMin]
            int temp = arr[i];
            arr[i] = arr[iMin];
            arr[iMin] = temp;
        }
    }
    // Utility method to print array
    static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
    // Main method
    public static void main(String[] args) {
        int[] arr = {10, 29, 9, 47, 2};

        System.out.println("Original array:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
