import java.util.Arrays;

public class programmers_42747 {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations[i];
            int k =  citations.length - i;
            if (k <= h) {
                answer = k;
                break;
            }
        }
        return answer;
    }
}
