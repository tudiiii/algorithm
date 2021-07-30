package MajorityElement;

import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_169Test {
    Leetcode_169 s = new Leetcode_169();

    @Test
    public void test(){
        assertEquals(s.majorityElement(new int[]{3,2,3}),3);
        assertEquals(s.majorityElement(new int[]{2,2,1,1,1,2,2}),2);
    }

}