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
    public static void print(int[] arr){
        for (int el:arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {5,7,7,8,8,10};
        int[] arr2 = {9,9,8,8,7,7,7,7,4,4,4,1,1};
        System.out.println(Arrays.toString(firstAndLastOccurDesc(arr2, 7)));
    }
}
