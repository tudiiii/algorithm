package 피보나치수2;

import etc.피보나치수2.Baekjoon_2748;
import org.junit.Assert;
import org.junit.Test;

public class Baekjoon_2748Test {

    Baekjoon_2748 s = new Baekjoon_2748();

    @Test
    public void test(){
        Assert.assertEquals(s.Fibonacci(10),55);
    }

    @Test
    public void test2(){
        Assert.assertEquals(s.Fibonacci2(10),55);
    }

    @Test
    public void test3(){
        Assert.assertEquals(s.Fibonacci3(10),55);
    }

}