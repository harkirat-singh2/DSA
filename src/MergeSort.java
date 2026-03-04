public class MergeSort {
    public static int[] mergingTwoSortedArr(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] arr = new int[(size)];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    private static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        int n = arr.length;
        //Create 2 arrays of sizen/2 each
        int[] a = new int[n / 2];
        int[] b = new int[n - (n / 2)];
        // Step 2 : Copy-paste arr into a and b
        int idx = 0; // idx travel karega arr pe
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];
        mergeSort(a);
        mergeSort(b);
        // Merge a and b into arr
        int[] merged = mergingTwoSortedArr(a, b);

        System.arraycopy(merged, 0, arr, 0, arr.length);

    }
    public static int inversionCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >arr[j]){
                    count++;    //T.c -> O(n sq2)
                }
            }
        }
        return count;
    }
    public static int inversionCountMergeSort(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void print(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 7, 9, 3, 4};
        int[] a = {1, 2, 5, 7, 10};
        int[] b = {3, 4, 6, 8, 9};
        int[] c = mergingTwoSortedArr(a, b);
        mergeSort(arr);
        print(arr);
    }


}