package sorting;

import java.util.Arrays;

import java.util.random.RandomGenerator;

public class MergeSort {
    public static void main(String[] args) {

        int n = 20;
        int[] nums = new int[n];
//        nums[0] = 5;nums[1] = 4;nums[2] = 3;nums[3] = 2;nums[4] = 1;

        for (int i = 0; i < n; i++) {
            nums[i] = RandomGenerator.getDefault().nextInt(1000 * 10) + RandomGenerator.getDefault().nextInt(100 * 10) + RandomGenerator.getDefault().nextInt(200 * 10);
        }
        System.out.println("Before.");

        Arrays.stream(nums).forEach(System.out::println);

        nums = sortArray(nums);

        //print after sort
        System.out.println("After.");
        Arrays.stream(nums).forEach(System.out::println);

    }

    private static int[] sortArray(int[] nums) {

        //base condition
        if (nums.length <= 1) {
            return nums;
        }
        // length = 5, mid = 2,
        //split into 2 arrays
        int mid = nums.length / 2;
        int firstStart = 0;
        int firstEnd = mid - 1; //  2 -1 = 1

        int secondStart = mid;
        int secondEnd = nums.length - secondStart;  // 5 - 2 = 3

        int firstArray[] = new int[mid];
        int secondArray[] = new int[secondEnd];

        //copy elements from original array into split arrays
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = nums[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = nums[i + secondStart];
        }


        firstArray = sortArray(firstArray);
        secondArray = sortArray(secondArray);

        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int index = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < firstArray.length && secondIndex < secondArray.length) {

            if (firstArray[firstIndex] <= secondArray[secondIndex]) {
                mergedArray[index] = firstArray[firstIndex];
                firstIndex++;
            } else {
                mergedArray[index] = secondArray[secondIndex];
                secondIndex++;
            }
            index++;
        }
        while (firstIndex < firstArray.length) {
            mergedArray[index++] = firstArray[firstIndex++];
        }

        while (secondIndex < secondArray.length) {
            mergedArray[index++] = secondArray[secondIndex++];
        }
        return mergedArray;
    }
}
