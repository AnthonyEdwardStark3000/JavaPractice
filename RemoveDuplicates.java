import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args) {
        int [] numbers = {1,1,2};     
        HashSet<Integer> hs =  new HashSet<>();
        for(int i : numbers){
            hs.add(i);
        }
        System.out.println(hs);

    }
}
