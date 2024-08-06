public class Power_of_2 {
    public static void main(String[] args) {
        System.out.println(power2(8));
    }
    static String power2(int number){
        String answer = "Yes";
        int n = number;
        int negative = number*-1;
        int result = number&negative;
        if(result!=n){
            answer="No";
        }
        return answer;
    }
}
