package basic;

import java.util.HashSet;
import java.util.Set;

public class AnagramOrNot {
    public static void main(String[] args) {

        String s =  "cccbbbb";
        System.out.println(gameOfThrones(s));
    }


    public static String gameOfThrones(String s) {
        // Write your code here
        String result = "YES";
        // Map<Character, Integer>  m = new HashMap<Character, Integer>();
        Set<Character> set = new HashSet<>();

        for(int i =0; i<s.length(); i++){

            // if(m.get(s.charAt(i)) != null){
            //     m.remove(s.charAt(i));
            // }else{
            //     m.put(s.charAt(i), 1);
            // }

            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
            System.out.println(set.size());

        }
        result = set.size()> 1? "NO": result ;

        return result;

    }
}
