public class var_args {
    public static void main(String[] args) {
        int[] ar = {1,2,4,5,5};
        int num = 10;
        add(ar);
        add(num);
        add();
    }
    
    // private static void add(int a, int ...args){
    //     System.out.println(a);
    // }


    // Not allowed
    // private static void add(int ...args, int a){
    //     System.out.println(a);
    // }

    private static void add(int ...args){
        System.out.println(args.toString());
    }
}
