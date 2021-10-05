package CombinationSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_39Test {

    Leetcode_39 s = new Leetcode_39();


    @Test
    public void test(){

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList(Arrays.asList(2,2,2,2)));
        list.add(new ArrayList(Arrays.asList(2,3,3)));
        list.add(new ArrayList(Arrays.asList(3,5)));

        Assert.assertEquals(s.combinationSum(new int[]{2,3,5},8),list);
    }

    @Test
    public void test2(){

        List<List<Integer>> list = new ArrayList<>();


        Assert.assertEquals(s.combinationSum(new int[]{2},1),list);
    }

    @Test
    public void test3(){

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList(Arrays.asList(1)));

        Assert.assertEquals(s.combinationSum(new int[]{1},1),list);
    }

    @Test
    public void test4(){

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList(Arrays.asList(1,1)));

        Assert.assertEquals(s.combinationSum(new int[]{1},2),list);
    }

}