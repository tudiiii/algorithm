package 크레인인형뽑기게임;
/*
테스트 1 〉	통과 (0.05ms, 52.5MB)
테스트 2 〉	통과 (0.08ms, 51.6MB)
테스트 3 〉	통과 (0.10ms, 51.8MB)
테스트 4 〉	통과 (1.36ms, 52.4MB)
테스트 5 〉	통과 (0.06ms, 52.7MB)
테스트 6 〉	통과 (0.08ms, 53MB)
테스트 7 〉	통과 (0.16ms, 52.4MB)
테스트 8 〉	통과 (0.43ms, 51.9MB)
테스트 9 〉	통과 (0.40ms, 54MB)
테스트 10 〉	통과 (0.45ms, 52.8MB)
테스트 11 〉	통과 (0.75ms, 52.3MB)
 */
import java.util.Stack;

public class Programmers_64061 {

    Stack<Integer> stack = new Stack<>();
    int answer = 0;

    public int solution(int[][] board, int[] moves) {
        int j;

        for (int move : moves) {
            j = 0;
            while (j < board.length) {
                if (board[j][move - 1] != 0) {
                    popStack(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
                j++;
            }
        }

        return answer*2;
    }

    public void popStack(int num){
        if(stack.isEmpty() || stack.peek() != num){
            stack.push(num);
        }else{
            stack.pop();
            answer++;
        }
    }
}
