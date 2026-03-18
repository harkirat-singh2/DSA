package ImpTopics;

public class SlidingWindow {
//    static int[] slidingWindowApproach1(int[] arr,int k){
//        for (int i = 0; i < arr.length; i++) {
//            int min = Integer.MIN_VALUE;
//            for (int j = i; j < i+k; j++) {
//
//
//            }
//        }
//    }

    static int subArrayEqualsK(int[] arr, int k) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int sum = 0;

                for (int l = i; l <= j; l++) {
                    sum += arr[l];
                }

                if (sum == k) total++;
            }
        }

        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,-5,-1,5,6,9,9,-3};
        System.out.println(subArrayEqualsK(arr,5));
    }
}
