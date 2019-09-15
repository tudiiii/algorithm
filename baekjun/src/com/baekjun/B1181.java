package com.baekjun;
import java.util.*;

public class B1181 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();

        Set<String> set =  new HashSet<String>();

        for (i = 0; i < n; i++)
            set.add(sc.next());

        String[] array = new String[set.size()];

        //해쉬셋 요소들 배열에 담기
        set.toArray(array);
        //사전순으로 정렬
        Arrays.sort(array);

        //길이순으로 정렬,람다
        Arrays.sort(array,(s1, s2) -> Integer.compare(s1.length(), s2.length()));

        for(i = 0; i < set.size(); i++)
            System.out.println(array[i]);
    }
}