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
        for (String each : input) {
            if (countMap.containsKey(each)) {
                countMap.put(each, 1);
            } else {
                countMap.put(each, countMap.get(each) + 1);
            }
        }
        return countMap;
    }

    public Map<Integer, Integer> countDuplicates(Integer[] input) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int count = 0;
        for (Integer each : input) {
            if (countMap.containsKey(each)) {
                countMap.put(each, count);
            } else {
                countMap.put(each, countMap.get(each) + 1);
            }
        }
        return countMap;
    }
}


        /**
         * Example of overloading a function that accepts a Array of Integers
         * @param input
         * @return
         */



