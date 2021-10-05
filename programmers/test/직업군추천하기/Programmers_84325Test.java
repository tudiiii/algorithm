package 직업군추천하기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_84325Test {
    Programmers_84325 s = new Programmers_84325();

    @Test
    public void test(){
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7,5,5};

        assertEquals(s.solution(table,languages,preference),"HARDWARE");
    }

    @Test
    public void test2(){
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"JAVA", "JAVASCRIPT"};
        int[] preference = {7,5};

        assertEquals(s.solution(table,languages,preference),"PORTAL");
    }


}