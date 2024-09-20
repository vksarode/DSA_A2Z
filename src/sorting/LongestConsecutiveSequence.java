package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class LongestConsecutiveSequence {
    public static void main(String[] args) {
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
//        String input  = "0,3,7,2,5,8,4,6,0,1";
        String input = "100,4,200,1,3,2";

        // Convert the input string to an int array
        int[] nums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Max consecutive subsequence length:"+ obj.longestConsecutive(nums) );
    }
    public int longestConsecutive(int[] nums) {
        nums =  new int[0];
        // create map with frequency
        Map<Integer, Integer> map = new HashMap<>();
        int maxSeq = 0;

        for(int i =0; i< nums.length; i++){
            if(map.get(nums[i]) != null ){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int i=0; i<nums.length ; i++ ){
                int cnt = 1;
               if(map.get(nums[i]-1) == null){
                    int number = nums[i] + 1;
                    while(map.get(number++) != null ){
                       cnt++;     
                    }
                    maxSeq = Math.max(maxSeq, cnt);
               } 
        }

        return maxSeq;
        
    }
}