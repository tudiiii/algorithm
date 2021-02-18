package GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        backTrack(list, "", 0, 0, n);

        return list;
    }

    public void backTrack(List<String> list, String str, int open, int close, int max){
        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max) // n 크기보다  '(' 괄호수 작을경우
            backTrack(list,str+"(", open+1, close, max);

        if(open > close) // '(' 개수 > ')' 개수
            backTrack(list, str+")", open, close+1, max);
    }
}
