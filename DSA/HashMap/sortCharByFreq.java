package DSA.HashMap;

import java.util.*;
public class sortCharByFreq {
    // LC - 451. Sort Characters By Frequency
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            int freq = entry.getValue();
            while(freq-- != 0)
                ans.append(entry.getKey());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("tree")); // Output: "eetr" or "eert"
        System.out.println(frequencySort("cccaaa")); // Output: "aaaccc"
    }
}