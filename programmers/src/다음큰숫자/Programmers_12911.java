package 다음큰숫자;

public class Programmers_12911 {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int number = n;

        while (number>0) {
            if (count == Integer.bitCount(++number)) {
                break;
            }
        }

        return number;
    }
}
