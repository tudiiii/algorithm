package N제곱배열자르기;

public class Programmers_87390 {
    public int[] solution(int n, long left, long right) {
        int[] result = new int[(int) (right - left + 1)];

        int index=0;
        for (long i = left; i <=right; i++) {
            int quotient = (int) (i / n) + 1;
            int remainder = (int) (i % n) + 1;
            result[index++] = Math.max(remainder, quotient);
        }

        return result;
    }
}
