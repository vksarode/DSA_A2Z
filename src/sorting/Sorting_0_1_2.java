package sorting;

import java.util.Arrays;

public class Sorting_0_1_2 {
    public static void main(String[] args) {
        int n = 12;
        int[] nums = new int[n];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 0;
        nums[4] = 1;
        nums[5] = 2;
        nums[6] = 1;
        nums[7] = 2;
        nums[8] = 0;
        nums[9] = 0;
        nums[10] = 0;
        nums[11] = 1;
        System.out.println("Before.");
        Arrays.stream(nums).forEach(System.out::print);
        int low=0, mid =0, high = nums.length - 1, temp = 0;

        while( mid <= high ){

            if(nums[mid] == 0){
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }

            if(nums[mid] ==1 ){
                mid++;
            }

            if(nums[mid] == 2){
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
//                mid++;
                high--;
            }
        }

        System.out.println("Before.");
        Arrays.stream(nums).forEach(System.out::println);

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
