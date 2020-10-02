import java.util.Stack;

public class Programmers_42883 {
    public String solution(String number, int k) {

        Stack<Character> stack = new Stack<>(); // 스택
        char[] nums = number.toCharArray(); // number 를 하나씩 쪼개서 char
        char[] answer = new char[number.length() - k];

        int deleteCnt = 0;
        int i=0;

        while(i!=nums.length){

            if(!stack.isEmpty() && stack.peek()<nums[i] && deleteCnt != k) {
                stack.pop();
                deleteCnt++;
            }

            stack.push(nums[i]);

            i++;
            System.out.println(stack);
        }

        for (i=0; i<answer.length; i++) {
            answer[i] = stack.get(i);
        }
        return new String(answer);

    }
}
