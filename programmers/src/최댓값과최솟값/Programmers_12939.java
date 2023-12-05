package 최댓값과최솟값;

import java.util.Arrays;

public class Programmers_12939 {
    public String solution(String s) {
        String[] tokens = s.split(" ");

        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        Arrays.sort(numbers);
        return numbers[0] + " " + numbers[numbers.length - 1];
    }
}
