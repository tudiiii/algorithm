package RomantoInteger;

import java.util.HashMap;
import java.util.Map;
/*
Runtime: 4 ms
Memory Usage: 39.6 MB
 */
public class Leetcode_13 {
    public int romanToInt(String s) {
        int sum = 0;

        Map<Character, Integer> map = new HashMap<>();

        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);

        int prev = map.get(s.charAt(0));

        for(int i=1;i<s.length();i++){
            int next = map.get(s.charAt(i));

            if(prev < next){
                sum -= prev;
            } else {
                sum += prev;
            }

            prev = next;
        }

        sum += prev;

        return sum;
    }
}
