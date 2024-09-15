import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int n = 12;
        String input = "1,2,3,1,1,1,1,4,2,3,0,1";

        // Convert the input string to an int array
        int[] nums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();

        int maxSum = Integer.MIN_VALUE;
        int k = 3;

//        bruteForceSolution(n, nums, k);

//        betterSolution(n, nums, k);

        //optima solution using two pointers: for positives and negatives

        optimalSolution(n, nums, k);
    }

    private static void bruteForceSolution(int n, int[] nums, int k) {
        //Brute Force solution
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    System.out.println("sub array- i=" + i + " to j=" + j);
                    sum = 0;
                    i = j + 1;
                }
            }
        }
    }

    private static void optimalSolution(int n, int[] nums, int k) {

//                String input = "1,2,3,1,1,1,1,4,2,3,0,1";
        int left = 0, right = 0, sum = 0, cnt = 0, len = 0;
        sum = nums[0];
        while (right < nums.length) {
            if (sum == k) {
                cnt++;
                len = Math.max(len, right - left + 1);
                System.out.println("sub array- i=" + left + " to j=" + right);
            }
            right++;
            if (right < nums.length) {
                sum += nums[right];
            }

            while (left <= right && sum > k) {
                sum = sum - nums[left];
                left++;
            }
        }


        System.out.println("max sub array length=" + len);
        System.out.println("max sub array count =" + cnt);

    }

    private static void betterSolution(int n, int[] nums, int k) {
        //Better solution : for positives and negatives

        Map<Integer, Integer> prefixSumMap = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefixSumMap.putIfAbsent(sum, i);

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if (prefixSumMap.get(rem) != null) {
                int len = i - prefixSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            prefixSumMap.putIfAbsent(sum, i);
        }

        System.out.println("max sub array- i=" + maxLen);
    }

}
