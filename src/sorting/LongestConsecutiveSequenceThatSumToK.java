package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class LongestConsecutiveSequenceThatSumToK {
    public static void main(String[] args) {
        LongestConsecutiveSequenceThatSumToK obj = new LongestConsecutiveSequenceThatSumToK();
        long n = 33;
        obj.sumOfThree(n);
    }

    public long[] sumOfThree(long num) {
        long mid = num/3;
        long[] l = new long[3];
        if((mid -1 + mid + mid+1 )== num ){
            l[0] = mid-1;
            l[1] = mid;
            l[2] = mid+1;
            return l;
        }else{
            return new long[0];
        }

    }
}