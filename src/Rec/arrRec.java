package Rec;

public class arrRec {
    public static void arrayyy(int[] arr,int idx){
        if (idx==arr.length) return;
        System.out.println(arr[idx]);
        arrayyy(arr , idx+1);
    }
    public static void revarrayyy(int[] arr,int idx){
        if (idx==arr.length) return;
        revarrayyy(arr , idx+1);
        System.out.println(arr[idx]);
    }
    public static boolean exists(int[] arr,int el,int idx){
        if (idx==arr.length) return false;
        if (arr[idx]==el) return true;
       return exists(arr ,el,idx+1);
    }

        public int helper(int[] nums, int target, int lo, int hi) {
            if (lo > hi) return -1; // base case

            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target)
                return helper(nums, target, lo, mid - 1);
            else
                return helper(nums, target, mid + 1, hi);
        }

        public int search(int[] nums, int target) {
            return helper(nums, target, 0, nums.length - 1);
        }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,54,6,4,3,5,3};
        System.out.println(exists(arr, 7, 0));    }
}
