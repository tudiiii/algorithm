package 단어변환;

public class Programmers_43163 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        dfs(begin,target,"");
        return answer;
    }

    public void dfs(String begin, String target, String result){
        if(target.equals(result)){

        }
    }
}
