public class Swapping_two_numbers {
    public static void main(String[] args){
        System.out.println(swap(12,3));
    }
    static String swap(int a ,int b){
        String ans="";
        int a1 = (a*b)/(b=a);
        ans += "a :"+Integer.toString(a1)+"\tb :"+Integer.toString(b);
        return ans;
    }
}
