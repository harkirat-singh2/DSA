package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public static int firstOccur(int[] arr,int target){
        int index = -1;
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
            else {
                index= mid;
                high = mid-1;
            }
        }
        return index;
    }
    public static int[] firstAndLastOccurasc(int[] arr , int target){
        int[] index = new int[2];
        int n = arr.length  , low=0 , high=n-1;
        int first= -1 , last = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                first= mid;
                high = mid-1;
            }
            else if (arr[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
          low=0; high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                last= mid;
                low = mid+1;
            }
            else if (arr[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return new int[]{first, last};
    }
    public static ArrayList<Integer> firstAndLastOccurascArrayList(int[] arr , int target){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length  , low=0 , high=n-1;
        int first= -1 , last = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                first= mid;
                high = mid-1;
            }
            else if (arr[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        ans.add(first);
        low=0; high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                last= mid;
                low = mid+1;
            }
            else if (arr[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        ans.add(last);
        return ans;
    }
    public static int[] firstAndLastOccurDesc(int[] arr , int target){
        int[] index = new int[2];
        int n = arr.length  , low=0 , high=n-1;
        int first= -1 , last = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                first= mid;
                low = mid+1;
            }
            else if (arr[mid]<target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        low=0; high=n-1;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                last= mid;
                high = mid-1;
            }
            else if (arr[mid]<target) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return new int[]{last, first};
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0 , high=n-1;
        while (low<high){
            int mid = low + (low+high)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;

    }
    public static int findFloor(int[] arr, int target) {
        // code here
        int ans = -1;
        int n = arr.length;
        int low = 0 , high = n-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                low = mid + 1;
            }
            else if (arr[mid] > target) high = mid - 1;
        }
            return ans;
    }
//    public static int maxCount(int[] arr){
//        int pos = 0 , neg = 0;
//        int n = arr.length;
//        int low = 0 , high = n-1;
//        while(low<high) {
//            int mid = low + (high - low) / 2;
//            if (arr[mid]>=0) {
//               low = mid+1;
//            }
//
//
//        }
//        return Math.max(pos,neg);
//    }
    public static void print(int[] arr){
        for (int el:arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {5,6,7,7,8,8,10};
        int[] arr2 = {9,9,8,8,7,7,7,7,4,4,4,1,1};
        System.out.println(Arrays.toString(firstAndLastOccurDesc(arr2, 7)));
        System.out.println(firstAndLastOccurascArrayList(arr1,8));
        System.out.println(findFloor(arr1,9));
        System.out.println(Arrays.toString(firstAndLastOccurasc(arr1,5)));
        System.out.println(peakIndexInMountainArray(arr1));

    }
}
