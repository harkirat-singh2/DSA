package TwoDArrays;

public class Transpose {
    public static void print(int[][] arr){
        for (int[] a : arr){
            for (int el : a){
                System.out.print(el+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        print(arr);
    }
}
