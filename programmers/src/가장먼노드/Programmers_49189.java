package 가장먼노드;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers_49189 {

    ArrayList<ArrayList<Integer>> list= new ArrayList<>();
    boolean[] visited;

    public int solution(int n, int[][] edge) {
        visited = new boolean[n+1];

        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }

        for (int[] ints : edge) {
            list.get(ints[0]).add(ints[1]);
            list.get(ints[1]).add(ints[0]);
        }

        for(int i=0; i<n; i++) {
            Collections.sort(list.get(i));
        }

        return bfs();
    }

    private int bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        int maxDepth = 0;

        while (!queue.isEmpty()) {
            maxDepth = queue.size();

            for (int i = 0; i < maxDepth; i++) {
                int tmp = queue.poll();

                for (int j = 0; j < list.get(tmp).size(); j++) {
                    if(!visited[list.get(tmp).get(j)]){
                        visited[list.get(tmp).get(j)]=true;
                        queue.offer(list.get(tmp).get(j));
                    }
                }
            }
        }

        return maxDepth;
    }
}
