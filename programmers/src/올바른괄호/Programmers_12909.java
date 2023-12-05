package 올바른괄호;

public class Programmers_12909 {
    boolean solution(String s) {
        int check = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') check++;
            else check--;

            if (check < 0) {
                return false;
            }
        }

        return check == 0;
    }
}
