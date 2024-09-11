package sorting;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class QuickSort {
    public static void main(String[] args) {
        int n = 20;
        int[] nums = new int[n];
        nums[0] = 4;
        nums[1] = 6;
        nums[2] = 2;
        nums[3] = 5;
        nums[4] = 7;
        nums[5] = 9;
        nums[6] = 1;
        nums[7] = 3;
//
        for (int i = 0; i < n; i++) {
            nums[i] = RandomGenerator.getDefault().nextInt(1000 * 10) + RandomGenerator.getDefault().nextInt(100 * 10) + RandomGenerator.getDefault().nextInt(200 * 10);
        }
        System.out.println("Before.");

//        Arrays.stream(nums).forEach(System.out::println);

        nums = quickSort(nums, 0, nums.length - 1);
        Arrays.stream(nums).forEach(System.out::println);

    }

    private static int[] quickSort(int[] nums, int low, int high) {

        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }

        return nums;
    }

    private static int partition(int[] nums, int low, int high) {
        int i = low;
        int j = high;
        int pivot = nums[low];
        int temp = 0;
        while (i < j) {
            while (i <= high && nums[i] <= pivot) {
                i++;
            }
            while (j >= low && nums[j] > pivot) {
                j--;
            }

            if (i < j) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        temp = nums[j];
        nums[j] = nums[low];
        nums[low] = temp;
        return j;

    }


}
