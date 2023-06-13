package 자료구조.N번째큰수;
/*
    N번째 큰수 : https://www.acmicpc.net/status?user_id=tudy0207&problem_id=2075&from_mine=1
    메모리 211984KB	시간 860ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int data = Integer.parseInt(st.nextToken());
            pq.offer(data);
        }


        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<N; j++) {
                int data = Integer.parseInt(st.nextToken());

                if(pq.peek() < data){
                    pq.poll();
                    pq.offer(data);
                }
            }
        }

        System.out.println(pq.poll());
    }
}
