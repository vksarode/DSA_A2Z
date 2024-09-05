package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("SelectionSort example.");
        int nums[] = {2,0,2,1,1,0};

        nums = bubbleSort.sort(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    private int[] sort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }


}
