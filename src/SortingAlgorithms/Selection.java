package SortingAlgorithms;

public class Selection {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {          // passes
            int min = Integer.MAX_VALUE;
            int pos=-1;
            for (int j = 0; j < n - i -1 ; j++) {  // comparisons
                if (min > arr[j]) {         // correct indices
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void print (int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={1,2,8,0,-4,0,6,5,0,3,-2,-9,4};
        System.out.println("Hello");
    }
}
