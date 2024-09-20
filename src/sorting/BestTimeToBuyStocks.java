package sorting;

import java.util.Arrays;

public class BestTimeToBuyStocks {
    public static void main(String[] args) {

        BestTimeToBuyStocks obj = new BestTimeToBuyStocks();
//        String input = "7,1,5,3,6,4";
//        String input ="2,1,2,1,0,1,2";
        String input = "1,2,4,2,5,7,2,4,9,0,9";
        // Convert the input string to an int array
        int[] nums = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Max profit: " + obj.maxProfit(nums) );

    }

    public int maxProfit(int[] prices) {

        int left = 0;
        int right = 1;
        int maxProfit =0;
        if(prices.length ==1){
            return 0;
        }else{
            for(int i=1; i<prices.length && right < prices.length; i++) {
                if (prices[left] >= prices[right]) {
//                    left++;
                    left= right;
                } else {
                    maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                }

                right++;
            }
        }
        return maxProfit;
    }
}
