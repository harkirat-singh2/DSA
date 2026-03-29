package SlidingWindow;

import java.util.ArrayList;

public class slidingWindow {

    int maxSumOfSubarrayBruteForce(int[] arr, int k){
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i < n-k+1; i++) {
            int sum = 0;
            for (int j = i; j < i + k - 1; j++) {
                sum+=arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public int maxSumOfSubarrayOptimized(int[] arr, int k) {
        int n = arr.length;
        // Step 1: sum of first window
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        // Step 2: slide the window using for loop
        for (int i = 1; i < n - k + 1; i++) {
            int prevElement = arr[i - 1];       // leaving element
            int nextElement = arr[i + k - 1];   // entering element

            sum = sum - prevElement + nextElement;

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    ArrayList<Integer> firstNegIntWindow(int[] arr,int k){
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i <  n - k + 1; i++) {
            boolean found = false;
            for (int j = i; j < i+k; j++) {
                if (arr[j]<0){
                    al.add(arr[j]);
                    found =true;
                    break;
                }
            }
            if (!found) {
                al.add(0);
            }
        }
        return al;
    }

    public static void main(String[] args) {

    }
}
