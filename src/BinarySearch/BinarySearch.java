package BinarySearch;

public class BinarySearch {
    public static boolean binSearch(int[] arr,int target){
        boolean flag = false;
        int n=arr.length;
        int low=0 , high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>target) {
                high = mid-1;
            }
            else if (arr[mid]<target) {
                low = mid+1;
            }
            else return true;
        }
        return flag;
    }
    public static void print(int[] arr){
        for (int el:arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,2,8,0,-4,0,6,5,0,3,-2,-9,7};
        System.out.println(binSearch(arr,7));
    }
}
