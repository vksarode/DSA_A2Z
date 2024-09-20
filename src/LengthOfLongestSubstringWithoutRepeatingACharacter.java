import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LengthOfLongestSubstringWithoutRepeatingACharacter {
    public static void main(String[] args) {
    String s = "abcabcdbbd";
//        String s = "bbbb";
//String s = " ";
        System.out.println("maxLen:" +  lengthOfLongestSubstring(s));


    }

    public static int lengthOfLongestSubstring(String s) {
        int len = 0;
        TreeMap<String, Integer> map = new TreeMap<>();

        int cur = 0;
        int maxLen = 0;

        if(s != null && s.length() != 0 ){
            while(cur < s.length()){
                if(map.get(s.charAt(cur)+"") == null){
                    map.put(s.charAt(cur)+"", cur);
                }else{
                    maxLen = Math.max(maxLen, map.size()) ;
                    int index = map.get(s.charAt(cur)+"") + 1;
//                    map.keySet().stream().forEach(System.out:: print);
                     map = new TreeMap<>();
                    for(int i =index; i <=cur; i++){
                        map.put(s.charAt(i)+"", i);
                    }
                }
                maxLen = Math.max(maxLen, map.size()) ;
                cur++;
            }

        }
        return maxLen;
    }
}
