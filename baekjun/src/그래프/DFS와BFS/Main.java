package 그래프.DFS와BFS;

/*
    DFS와 BFS https://www.acmicpc.net/problem/1260
    메모리 20088KB	시간 260ms
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean[][] arr;
    static boolean[] visit;

    static StringBuilder sb;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {

        sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int node = Integer.parseInt(st.nextToken());

        arr = new boolean[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = true;
            arr[y][x] = true;
        }

        visit = new boolean[n + 1];
        dfs(node);

        sb.append("\n");

        visit = new boolean[n + 1];
        bfs(node);

        System.out.println(sb);
    }

    static void dfs(int node) {
        visit[node] = true;
        sb.append(node).append(" ");

        if(node == arr.length) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[node][i] && !visit[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visit[node] = true;

        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            sb.append(tmp).append(" ");

            for (int i = 1; i < arr.length; i++) {
                if (arr[tmp][i] && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}
