package 자료구조.스택수열;

/*
    스택 수열 : https://www.acmicpc.net/problem/1874
    메모리 27688KB	시간 360ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int tmp = 1;

        boolean isSequence = true;

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());

            while (tmp <= M) {
                stack.push(tmp);
                sb.append("+").append("\n");
                tmp++;
            }

            if (stack.peek() == M) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                isSequence = false;
            }
        }

        if(isSequence){
            System.out.println(sb);
        }else {
            System.out.println("NO");
        }


    }
}
