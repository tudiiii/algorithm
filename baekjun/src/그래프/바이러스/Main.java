package 그래프.바이러스;

/*
    바이러스 https://www.acmicpc.net/problem/2606
    bfs : 메모리 14280KB	시간 128ms
    dfs : 메모리 14288KB	시간 128ms
*/

import java.util.*;
import java.io.*;

public class Main {

    static Queue<Integer> queue = new LinkedList<>();
    static boolean[][] arr;
    static boolean[] visit;

    static int num, connNum;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        connNum = Integer.parseInt(br.readLine());

        arr = new boolean[num + 1][num + 1];
        visit = new boolean[num + 1];

        StringTokenizer st;
        for (int i = 0; i < connNum; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = true;
            arr[y][x] = true;
        }

        //bfs();
        dfs(1);

        System.out.println(count);
    }

    public static void bfs() {
        queue.offer(1);
        visit[1] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i = 1; i < num + 1; i++) {
                if (!arr[node][i] || visit[i]) {
                    continue;
                }

                queue.offer(i);
                visit[i] = true;
                count++;
            }
        }
    }

    public static void dfs(int node) {
        visit[node] = true;

        for (int i = 1; i < num + 1; i++) {
            if (arr[node][i] && !visit[i]) {
                dfs(i);
                count++;
            }
        }
    }

}
