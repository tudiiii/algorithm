public class CommonFactorAndMultiple {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
    // 최소공배수 (n*m)/최대공약수
    public static int lcm(int s, int b) {
        return (s * b) / gcd(s, b);
    }

    public static int gcd(int s, int b) {
        int r;

        while (s != 0) {
            r = b % s;
            b = s;
            s = r;
        }

        return b;
    }

}
