import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Anagram {
    public static void main(String[] args) throws IOException {

        String s= "aaabbb";
                int result = anagram(s);
    }


    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
    
    // Write your code here
    if(s.length()%2 != 0){
        return -1;
    }
    Map<Character, Integer> first = new HashMap<>();
    Map<Character, Integer> second = new HashMap<>();
    int count = 0;
    
    for(int i=0;i<s.length();i++){
        
        if(i < s.length()/2){
             if(first.get(s.charAt(i)) != null){
                first.put(s.charAt(i), first.get(s.charAt(i)) +1 );
             }else{
                 first.put(s.charAt(i), 1);
             }
            
        }else{
            if(first.get(s.charAt(i)) != null){
                if(first.get(s.charAt(i)) > 1 ){
                    first.put(s.charAt(i), first.get(s.charAt(i)) - 1 );
                }else{
                    first.remove(s.charAt(i));
                }
               
            }else{
//                second.put(s.charAt(i), 1);
                count++;
            }
        }        
        
    }
//    return second.size();
        return count;
    

    }


}
