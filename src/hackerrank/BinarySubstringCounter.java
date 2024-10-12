package hackerrank;

import java.util.*;

public class BinarySubstringCounter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            String s = sc.nextLine();
//            System.out.println(countValidSubstrings(s));

            int cnt  =1;
            int x =0, y=0;
            for(int i=1; i< s.length(); i ++){
                if( s.charAt(i-1) ==  s.charAt(i)){
                    x++;
                }else{
                    y++;
                }

                if(x==y){
                    cnt++;
                }
            }
            if(x != y){
                cnt = -1;
            }


        }


        
        sc.close();
    }
    
    // Function to count the number of valid substrings in the binary string
    public static int countValidSubstrings(String s) {
        // List to store lengths of consecutive groups of 0s and 1s
        List<Integer> groupLengths = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        int n = s.length();
        int count = 1;
        
        // Traverse the string to find the lengths of consecutive groups
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++; // Continue counting the current group
            } else {
                groupLengths.add(count); // End of a group, add its length to the list
                count = 1; // Reset count for the next group

            }
        }
        groupLengths.add(count); // Add the last group
        
        // Now calculate the number of valid substrings
        int result = 0;
        for (int i = 1; i < groupLengths.size(); i++) {
            // The number of valid substrings between two consecutive groups
            result += Math.min(groupLengths.get(i - 1), groupLengths.get(i));
        }
        
        return result;
    }
}
