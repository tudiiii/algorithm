package 최단거리.특정거리의도시찾기;
/*
    특정 거리의 도시 찾기 https://www.acmicpc.net/problem/18352
    메모리 258052KB	시간 1000ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        List<Integer>[] edges = new List[N + 1];
        for (int i = 1; i <= N; i++) edges[i] = new ArrayList<>();

        int[] distances = new int[N + 1];
        Arrays.fill(distances, -1);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            edges[x].add(y);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(X);
        distances[X] = 0;

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            if (distances[tmp] > K) {
                break;
            }

            if (distances[tmp] == K) {
                answer.add(tmp);
            }

            for (int next : edges[tmp]) {
                if(distances[next] != -1) continue;
                distances[next] = distances[tmp] + 1;
                queue.add(next);
            }
        }

        Collections.sort(answer);
        StringBuilder sb = new StringBuilder();
        for (int tmp : answer) {
            sb.append(tmp).append('\n');
        }

        System.out.print(answer.isEmpty() ? -1 : sb);
    }
}
