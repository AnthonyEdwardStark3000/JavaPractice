import java.util.Arrays;

public class MinimumValueArray {
    public static int minimumArr(int[] arr){
        if(arr == null || arr.length == 0 ){
            throw new IllegalArgumentException("Invalid Exception"); 
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr = {65,2,87,9,23,7};
        System.out.println("Minimum number in the array "+Arrays.toString(arr)+" is :"+minimumArr(arr));
    }
}
