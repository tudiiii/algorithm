package MinStack;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 155. Min Stack
 * https://leetcode.com/problems/min-stack/
 *
 * Runtime: 315 ms
 * Memory Usage: 40.7 MB
 */

public class MinStack {

    private List<Integer> list ;

    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int val) {
        list.add(val);
    }

    public void pop() {
        if(list.size() > 0){
            list.remove(list.size()-1);
        }
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        int min=list.get(0);
        for (Integer integer : list) {
            if (min > integer) min = integer;
        }
        return min;
    }
}
