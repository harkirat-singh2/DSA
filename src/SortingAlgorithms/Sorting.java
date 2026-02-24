package SortingAlgorithms;

public class Sorting {
    public static boolean arraySortedOrNot(int[] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {          // passes
            for (int j = 0; j < n - i -1 ; j++) {  // comparisons
                if (arr[j] > arr[j + 1]) {         // correct indices
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {          // passes
            boolean isSorted = true;
            for (int j = 0; j < n - i -1 ; j++) {  // comparisons
                if (arr[j] > arr[j + 1]) {         // correct indices
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted=false;
                }
            }
            if (isSorted) break;
        }
    }
    public static void bubbleSortOptimizedSwap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {          // passes
            int swap = 0;
            for (int j = 0; j < n - i -1 ; j++) {  // comparisons
                if (arr[j] > arr[j + 1]) {         // correct indices
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap==0) break;
        }
    }
    public static void bubbleSortOptimizedSwapDesc(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int swap = 0;

            for (int j = n - 1; j > i; j--) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap++;
                }
            }

            if (swap == 0) break;
        }
    }
    public static void print (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int[] arr ={1,2,8,-4,6,5,3,-2,-9,4};
    bubbleSortOptimized(arr);
    print(arr);
    bubbleSortOptimizedSwapDesc(arr);
    print(arr);

    }
}
