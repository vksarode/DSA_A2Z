package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static boolean exists;

    public static void main(String[] args) {
        String input = "3,3";

// Convert the string to an int array in a single line
        int[] nums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
        int target = 6;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (m.get(comp) != null) {
                result[0] = m.get(comp);
                result[1] = i;
            }
            m.put(nums[i], i);
        }

        System.out.println(result[0] + " " + result[1]);

    }
}
