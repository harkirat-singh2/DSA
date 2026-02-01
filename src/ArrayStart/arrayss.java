package ArrayStart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrayss {
    public static void linearSearch(int[] arr,int target){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) {flag=true;
            break;}

        }if (flag) System.out.println("Target found");
        else System.out.println("Target not found");
    }
    public static void basicstheory(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
//      Taking input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//      for printing
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static int getLargest(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]) {
                max = array[i];
            }
        }return max;
    }
    public static int binarySearch(int[] array, int key) {
        // Input validation
        if (array == null || array.length == 0) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Avoid potential integer overflow
            if (array[mid] == key) {
                return mid; // Key found, return its index
            }
            if (array[mid] < key) {
                start = mid + 1; // Search in right half
            } else {
                end = mid - 1; // Search in left half
            }
        }
        return -1; // Key not found
    }
    public static void revArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        for (int i = 0; i < (arr.length-1)/2; i++) {
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] =temp;
            start++;
            end--;
        }
    }
    public static void mulOddindexEl2Add10EvenEl(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 !=0) arr[i]*=2;
            else{
                arr[i]+= 10;
            }
            System.out.print(arr[i]+" ");
        }

    }
    public int[] twoSumIndices(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            // fallback if nothing found
            return new int[]{};
        }
    public static int secondLargest(int[] arr){
        int largest =getLargest(arr);
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=largest && arr[i]>smax) {

                smax = arr[i];

            }

        }return smax;
    }
    public static void reverseArray(int[] arr){
        int n = arr.length;
//        int i = 0;
//        int j = arr.length-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
           arr[i]=arr[n-i-1];
           arr[n-i-1]=temp;
        }
        for(int el : arr) System.out.print(el +" ");
    }
    public static void halfArrayRev(int[] arr){
        int n = arr.length;
        int i = 3;
        int j = arr.length-3;
        while(i<j){
            int temp = arr[i];
           arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
       }
        for(int el : arr) System.out.print(el +" ");
    }
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotateArrayInplaceRight(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k > n

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the rest
        reverse(nums, k, n - 1);
    }
    public static void rotateArrayInplaceLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle cases where k > n

        // Step 1: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse the remaining n - k elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }
    public static int missingNum(int[] arr){
        int n = arr.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for (int el:arr){
            actualSum+=el;
        }return expectedSum-actualSum;
    }
    public static void sortthreeColours(int[] arr){
        int n = arr.length;
        int low =0;
        int mid = 0;
        int high=n-1;
        while (mid <= high) {
            // your conditions and swaps here
            if(arr[mid]==0){
                int temp =arr[mid];
                arr[mid]=arr[low];
                arr[low] = temp;
                low++;
                mid++;
        } else if (arr[mid]==2){
                int temp =arr[mid];
                arr[mid]=arr[high];
                arr[high] = temp;
                high--;
            }
        else{mid++;}
        }
    }

    public static void sortColorsTwo(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            if (arr[i]==0) i++;
            else if(arr[j]==1){
                j--;
            } else {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

        }
    }
    // Helper function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void waveArray(int[] arr){
        int n = arr.length;
        int i=0;
        int j=1;
        while(j <n){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }
    }
    public static void waveForArray(int[] arr) {
        Arrays.sort(arr); // sort first
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9 };

//        9,8,7,6,5,4,3,2,1
//        4,5,6,7,8,9,1,2,3

//         revArray(numbers);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]+" ");
//        }
//        System.out.println();
//        basicstheory();
//        rotateArrayInplaceLeft(arr,4);
//        for (int el:arr) System.out.print(el+ " ");
        int[] arra = {1,1,0,0,0,1};
       waveForArray(arr);
        for (int el:arr) System.out.print(el+ " ");


    }
}
