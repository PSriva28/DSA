class mergesort {
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int[] newarray = new int[ei - si + 1];

        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                newarray[x++] = arr[index1++];
            } else {
                newarray[x++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            newarray[x++] = arr[index1++];
        }

        while (index2 <= ei) {
            newarray[x++] = arr[index2++];
        }

        for (int i = 0, j = si; i < newarray.length; i++, j++) {
            arr[j] = newarray[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = {40, 10, 30, 70, 20};
        divide(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
