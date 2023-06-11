package 섬연결하기;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_42861 {

    public int solution(int n, int[][] costs) {
        int cost = 0;

        Arrays.sort(costs, Comparator.comparingInt(o -> o[2]));
        int[] parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int[] ints : costs) {
            if (findParents(parent, ints[0]) != findParents(parent, ints[1])) {
                union(parent, ints[0], ints[1]);
                cost += ints[2];
            }
        }

        return cost;
    }

    public static int findParents(int[] parent, int node) {
        if (parent[node] == node) {
            return node;
        }else {
            return findParents(parent, parent[node]);
        }
    }

    public static void union(int[] parent, int startNode, int endNode) {
        int startParent = findParents(parent, startNode);
        int endParent = findParents(parent, endNode);

        if (startParent > endParent)
            parent[startParent] = endParent;
        else
            parent[endParent] = startParent;
    }
}
