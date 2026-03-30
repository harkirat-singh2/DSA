package SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class slidingWindow {

    int maxSumOfSubarrayBruteForce(int[] arr, int k){
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i < n-k+1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
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

    ArrayList<Integer> firstNegIntWindowBruteFORCE(int[] arr,int k){
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
    ArrayList<Integer> firstNegIntWindow(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            // Step 1: add negative into queue
            if (arr[right] < 0) {
                q.add(arr[right]);
            }
            // Step 2: window size = k
            if (right - left + 1 == k) {

                // equivalent of "found"
                if (q.isEmpty()) res.add(0);
                else res.add(q.peek());
                // Step 3: remove outgoing element
                if (!q.isEmpty() && q.peek() == arr[left]) {
                    q.poll();
                }
                left++;
            }
        }
        return res;
    }

//    public int findMinDiffChocolateDistribution(ArrayList<Integer> arr, int m) {
//        int n = arr.size();
//        Collections.sort(arr);
//        int result = 0;
//        for (int i = 0; i < n-m+1; i++) {
//
//        }
//
//    }
    int TotalSubarrayGivesZero(int[] arr){
        int n= arr.length;
        int count=0;
        for (int i = 0; i < n; i++) {                   // T.C. ->O(n^3)
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum+=arr[k];
                }
                if (sum==0) count++;
            }
        }
        return count;
    }

    int TotalSubarrayGivesZeroNSquare(int[] arr){
        int n= arr.length;
        int count=0;
        for (int i = 0; i < n; i++) {                   // T.C. ->O(n^3)
            int sum = 0;
            for (int j = i; j < n; j++) {
                    sum+=arr[j];
                if (sum==0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
