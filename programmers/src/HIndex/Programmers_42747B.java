package HIndex;

import java.util.Arrays;

public class Programmers_42747B {
    public int solution(int[] citations) {
        int result = 0;
        int length = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < length; i++) {
            int h = length - i;
            System.out.println(h);
            if (h <= citations[i]) {
                result = h;
                break;
            }
        }

        return result;
    }
}
