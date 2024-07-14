import java.util.*;
public class RemoveEvenNumber{
    static int[]  printArr(int[] arr){
        int size = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                size++;
            }
        }
        int[] newArr = new int[size];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                newArr[index]= arr[i];
                index++;
            }
        }
        return newArr;
    }
    public static void main(String[] args){
       int[] arr = {3,2,4,7,10,6,5};
       System.out.println("Before conversion:"+Arrays.toString(arr));
       System.out.println("After conversion:"+Arrays.toString(printArr(arr)));
    }
}