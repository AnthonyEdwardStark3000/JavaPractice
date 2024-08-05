public class odd_or_even {
    public static void main(String[] args){
        System.out.println(oddEven(4)); 
    }
    static String oddEven(int number){
        String value = "Odd";
        int val = number&1;
        if(val!=1){
            value = "Even";
        }
        return value;
    }
}
