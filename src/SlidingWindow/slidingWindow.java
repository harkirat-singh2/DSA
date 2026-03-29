package SlidingWindow;

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

    public static void main(String[] args) {

    }
}
