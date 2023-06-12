package 자료구조.최대힙;
/*
    최대 힙 https://www.acmicpc.net/problem/11279
    메모리 26848KB	시간 340ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());

            if (tmp > 0) {
                pq.offer(tmp);
            }else {
                sb.append(pq.isEmpty() ? 0 : pq.poll()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
