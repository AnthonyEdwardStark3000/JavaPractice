public class  gfg_reverse{
    public static void main(String[] args){
        System.out.println(reverse(11));
    }
    static long reverse(long n){
        long temp = n;
        long reverse = 0;
        long remainder = 0; 
        while(n!=0){
            remainder = n%10;
            reverse = (reverse *10)+remainder;
            n/=10;
        }
        return reverse;
    }
}