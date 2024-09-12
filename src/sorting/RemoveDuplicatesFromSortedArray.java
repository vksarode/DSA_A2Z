package sorting;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int n = 8;
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 3;
        nums[4] = 4;
        nums[5] = 4;
        nums[6] = 5;
        nums[7] = 6;

        int i =0;

        System.out.println("Before.");
        Arrays.stream(nums).forEach(System.out::println);

        for (int j=1; j<nums.length-1; j++){
           if(nums[i] != nums[j]){
               nums[i+1] = nums[j];
               i++;
           }
        }
        System.out.println("After.");
        Arrays.stream(nums).forEach(System.out::println);
        System.out.println("Number of unique elements: "+ (i+1));

    }
}
