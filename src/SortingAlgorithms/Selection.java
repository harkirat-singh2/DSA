package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static ArrayList<Integer> commonEl(int[] a , int[] b){
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]) i++;
            else if (a[i]>b[j]) j++;
            else {
                arr.add(a[i]);
                i++;
                j++;
            }
        }


        return arr;
    }
    public static void print (int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={1,2,8,0,-4,0,6,5,0,3,-2,-9,4};
        int[] arr1 ={3,4,2,2,4};
        int[] arr2 ={1,2};
        System.out.println(commonEl(arr1,arr2));
    }
}
