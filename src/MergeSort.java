public class MergeSort {
    public static int[] mergingTwoSortedArr(int[] arr1 , int[] arr2){
        int size = arr1.length+arr2.length;
        int[] arr = new int[(size)];
        int i = 0, j = 0, k = 0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    public static void  print(int[] arr){
        for (int el : arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,5,7,10};
        int[] b = {3,4,6,8,9};
        int[] c = mergingTwoSortedArr(a,b);

        print(c);
    }
}
