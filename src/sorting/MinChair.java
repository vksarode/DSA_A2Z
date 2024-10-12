package sorting;
import java.io.*;
import java.util.*;


public class MinChair {
    public static void main(String[] args) throws IOException {


        List<String> simulations = new ArrayList<>();
//        simulations.add("CRUC");
        simulations.add("CCCC");
        List<Integer> result = minChairs(simulations);
        System.out.println(result);

    }

    public static List<Integer> minChairs(List<String> simulations) {
        // Write your code here
        List<Integer> result = new ArrayList<>();


        for(String s : simulations){

            int countOfChairs = 0, availableChairs=0;
            for(int j=0; j< s.length(); j ++){
                if('C' == s.charAt(j) || 'U' == s.charAt(j)){
                    if(availableChairs == 0){
                        countOfChairs++;
                    }else{
                        availableChairs--;
                    }
                }else if('R' == s.charAt(j) || 'L' == s.charAt(j)){
                    availableChairs++;
                }
            }
            result.add(countOfChairs);

        }

        return result;
    }
}
