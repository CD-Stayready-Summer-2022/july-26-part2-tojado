package cd.get.ready.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     *
     * @param input
     * @return
     */
    public Map<String, Integer> countDuplicates(String[] input) {
        //
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        String[] nums = input.split(" ");
        for (String num : nums) {
            Integer integer = countMap.get(num);
            if (integer == null) {
                Integer put = countMap.put(num, 1);
                    else{
                    countMap.put(num, integer + 1);
                }
            }
        }
        return countMap;
    }

   // public Integer countDuplicates(Integer[] input) {
        /**
         * Example of overloading a function that accepts a Array of Integers
         * @param input
         * @return
         */

        return null;

    }
}
