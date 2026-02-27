package SortingAlgorithms;

public class Insertion {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
           int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;

            }
        }
    }
    public static void print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,8,0,-4,0,6,5,0,3,-2,-9,4};
        insertionSort(arr);
        print(arr);
    }
}
