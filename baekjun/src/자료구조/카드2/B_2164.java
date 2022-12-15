package 자료구조.카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_2164 { // 	메모리 53364KB	시간 196ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();


        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1 ; i <= N ; i++) {
            queue.add(i);
        }

        while(queue.size()>1){
            queue.poll();

            int tmp = queue.poll();
            queue.offer(tmp);
        }

        System.out.println(queue.poll());
    }
}
