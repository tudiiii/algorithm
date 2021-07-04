package Subsets;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Leetcode_78Test {
    Leetcode_78 s = new Leetcode_78();

    @Test
    public void test(){
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList(Arrays.asList()));
        list.add(new ArrayList(Arrays.asList(1)));
        list.add(new ArrayList(Arrays.asList(2)));
        list.add(new ArrayList(Arrays.asList(1,2)));
        list.add(new ArrayList(Arrays.asList(3)));
        list.add(new ArrayList(Arrays.asList(1,3)));
        list.add(new ArrayList(Arrays.asList(2,3)));
        list.add(new ArrayList(Arrays.asList(1,2,3)));

        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(new ArrayList(Arrays.asList()));
        list2.add(new ArrayList(Arrays.asList(0)));

        assertEquals(s.subsets(new int[]{1,2,3}), list);
        assertEquals(s.subsets(new int[]{0}), list2);
    }
}