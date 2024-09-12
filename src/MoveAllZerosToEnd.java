import java.util.Arrays;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {

        int n = 7;
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 0;
        nums[2] = 0;
        nums[3] = 2;
        nums[4] = 0;
        nums[5] = 0;
        nums[6] = 3;


        System.out.println("Before.");
        Arrays.stream(nums).forEach(System.out::println);

//        moveZerosToRight_BruteForce(nums);

//        moveZerosToRight_Optimal(nums);

        moveZerosToRight_Optimal_2(nums);
    }

    private static int[] moveZerosToRight_Optimal(int[] nums) {

        int temp = 0;
        for(int i =0, j=nums.length -1;   i<j;  i++, j--){
            while(nums[i] != 0){
                i++;
            }

            while(nums[j] == 0){
                j--;
            }
            if(i <j){
                temp = nums[j];
                nums[j]= nums[i];
                nums[i]= temp;
            }

        }

        System.out.println("After - optimal solution");
        Arrays.stream(nums).forEach(System.out::println);
        return nums;

    }

    private static int[] moveZerosToRight_Optimal_2(int[] nums) {

        int i = 1, j=0, temp =0;

       while(i< nums.length){

           while( i< nums.length  && nums[i] == 0){
               i++;
           }
           while( j< nums.length && nums[j] != 0 ){
               j++;
           }
           if(i < nums.length) {
               temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
           }
           }

        System.out.println("After - optimal solution");
        Arrays.stream(nums).forEach(System.out::println);
        return nums;

    }

    private static int[] moveZerosToRight_BruteForce(int[] nums) {
        int size= 0;
        int temp[] = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length && j < nums.length; j++) {
            if (nums[j] != 0) {
                temp[i++] = nums[j];
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            nums[i] = temp[i];
        }


        for (int i = size; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println("After.");
        Arrays.stream(nums).forEach(System.out::println);
        return nums;
    }


}
