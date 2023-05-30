package 자료구조.쇠막대기;

/*
    쇠막대기 https://www.acmicpc.net/problem/10799
    메모리 15676KB	시간 152ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        int stack = 0;
        int count = 0;

        for (int i = 0; i < input.length; i++) {

            int ch = input[i];
            if(ch == '('){
                stack++;
            }else {
                stack--;

                if (input[i-1] == '(') {
                    count += stack;
                }else{
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
