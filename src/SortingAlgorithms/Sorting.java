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
            for (int j = 0; j < n - i -1 - i; j++) {  // comparisons
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
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    isSorted=false;
                    break;
                }
            }
            if (isSorted) break;
            for (int j = 0; j < n - i -1 - i; j++) {  // comparisons
                if (arr[j] > arr[j + 1]) {         // correct indices
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void print (int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int[] arr ={1,2,8,-4,6,5,3,-2,-9,4};
    bubbleSort(arr);
    print(arr);

    }
}
