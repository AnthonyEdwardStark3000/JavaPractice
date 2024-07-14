public class ReverseAnArray {
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    public static int[] reverse(int[] array){
        int[] newArray = new int[array.length];
        int index = 0;
        for(int i=array.length-1;i>=0;i--){
            newArray[index] = array[i];
            index++;
        }
        return newArray;
    }
    public static void main(String[]args){
        int[] arr = {1,2,4,6,8,12};
        System.out.println("Original Array"); 
        printArray(arr);
        int[] reversed = reverse(arr);
        System.out.println("Reversed Array"); 
        printArray(reversed);
    }
}
