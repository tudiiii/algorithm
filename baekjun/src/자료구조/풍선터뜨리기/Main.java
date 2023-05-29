package 자료구조.풍선터뜨리기;

/*
    풍선터뜨리기 https://www.acmicpc.net/problem/2346
    메모리 17212KB	시간 204ms
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    static class Balloon {
        int idx;
        int element;

        public Balloon(int idx, int element) {
            this.idx = idx;
            this.element = element;
        }
    }


    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Deque<Balloon> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= num; i++) {
            int element = Integer.parseInt(st.nextToken());
            deque.add(new Balloon(i, element));
        }

        while (!deque.isEmpty()) {
            sb.append(deque.getFirst().idx).append(" ");
            int element = deque.poll().element;

            if (deque.isEmpty()) break;

            if (element > 0) {
                for (int i = 0; i < element - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(element) ; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb);
    }

}
