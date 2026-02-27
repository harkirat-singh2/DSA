package SortingAlgorithms;

import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {   // passes

            int min = arr[i];
            int pos = i;

            for (int j = i + 1; j < n; j++) {   // search min in unsorted part
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }

            // swap after finding minimum
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }
    public static void selectionSortMax(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {   // passes

            int max = arr[n-i-1];
            int pos = n-i-1;

            for (int j = 0; j < n-1-i; j++) {   // search max in unsorted part
                if (arr[j] > max) {
                    max = arr[j];
                    pos = j;
                }
            }

            // swap after finding minimum
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[pos];
            arr[pos] = temp;
        }
    }
    public static boolean twoSumSortedArray(int[] arr,int target){
        Arrays.sort(arr);
        int n=  arr.length;
        int i=0;
        int j=n-1;
        while (i<j){
            if ((arr[i]+arr[j])==target)return true;
            if ((arr[i]+arr[j])>target)j--;
            else i++;
        }
        return false;
    }
    public static void print (int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={1,2,8,0,-4,0,6,5,0,3,-2,-9,4};
        System.out.println(twoSumSortedArray(arr,5));
    }
}
