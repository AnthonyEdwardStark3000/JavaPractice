public class gfg_gcd {
    public static void main(String[] args){
        System.out.println(gcd(3,6));
    }
    static int gcd(int a ,int b){
        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        return a;
    }
}
