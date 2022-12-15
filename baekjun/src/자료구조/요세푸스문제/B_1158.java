package 자료구조.요세푸스문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_1158 {	// 메모리 295292KB	시간 580ms

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while(queue.size()>1){

            for (int i = 0; i < K -1; i++) {
                int tmp = queue.poll();
                queue.offer(tmp);
            }

            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll());
        sb.append('>');
        System.out.println(sb);

    }
}
