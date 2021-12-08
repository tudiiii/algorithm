package 복서정렬하기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_85002Test {

    Programmers_85002 s = new Programmers_85002();

    @Test
    public void test(){
        try{


        return;        }catch (Exception e){

        }finally {
            System.out.println("황동현바보");
        }

        System.out.println("hi");
        assertArrayEquals(s.solution(new int[]{0,82,75,120}, new String[]{"NLWL","WNLL","LWNW","WWLN"}), new int[]{3,4,1,2});
        assertArrayEquals(s.solution(new int[]{145,92,86}, new String[]{"NLW","WNL","LWN"}), new int[]{2,3,1});
        assertArrayEquals(s.solution(new int[]{60,70,60}, new String[]{"NNN","NNN","NNN"}), new int[]{2,1,3});
    }

}