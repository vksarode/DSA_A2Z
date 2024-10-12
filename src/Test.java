import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello LeetCoder");

        String word = "aaFDAbcBC";
        splChars(word);
        System.exit(0);
        Set<Integer> lower = new HashSet<>();
        Set<Integer> capital = new HashSet<>();
        int count =0;

       for(int i =0; i<word.length(); i ++){
           int l =  word.charAt(i);
            if(l >= 65 && l<= 91){
                capital.add( l);
            }else{
                lower.add(l);
            }
        }
        for(Integer l: capital) {
            if(l >= 65 && l<= 91){
                if(lower.contains(l + 32)){
                    count++;
                }
            }
        }
        System.out.println("Count    "+ count);

    }

    public static void splChars(String args) {
        System.out.println("Hello LeetCoder");

        String word = "aaFDAbcBC";
        Set<Integer> lower = new HashSet<>();
        Set<Integer> capital = new HashSet<>();
        int count = 0;

        // Single loop for processing both capital and lowercase letters
        for (int i = 0; i < word.length(); i++) {
            int ch = word.charAt(i);

            if (ch >= 65 && ch <= 90) { // Capital letter
                capital.add(ch);
                // Check if corresponding lowercase exists
                if (lower.contains(ch + 32)) {
                    count++;
                }
            } else { // Lowercase letter
                lower.add(ch);
                // Check if corresponding capital exists
                if (capital.contains(ch - 32)) {
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);
    }
}