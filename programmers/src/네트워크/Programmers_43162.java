package 네트워크;
/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 52.9MB)
테스트 2 〉	통과 (0.03ms, 53.1MB)
테스트 3 〉	통과 (0.04ms, 51.8MB)
테스트 4 〉	통과 (0.04ms, 52.1MB)
테스트 5 〉	통과 (0.02ms, 52.8MB)
테스트 6 〉	통과 (0.12ms, 52.9MB)
테스트 7 〉	통과 (0.02ms, 53.7MB)
테스트 8 〉	통과 (0.09ms, 52.9MB)
테스트 9 〉	통과 (0.06ms, 53.7MB)
테스트 10 〉	통과 (0.06ms, 52.2MB)
테스트 11 〉	통과 (0.35ms, 53.6MB)
테스트 12 〉	통과 (0.19ms, 53.6MB)
테스트 13 〉	통과 (0.16ms, 53MB)
 */
public class Programmers_43162 {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                dfs(computers, i, check);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int[][] computers, int i, boolean[] check){
        check[i] = true;

        for(int j=0;j<computers.length;j++){
            if(j!=i && computers[i][j]==1 && !check[j]){
                dfs(computers, j, check);
            }
        }

    }

}

