package 멀쩡한사각형;
/*
정확성  테스트
테스트 1 〉	실패 (0.25ms, 67.7MB)
테스트 2 〉	실패 (0.31ms, 78.6MB)
테스트 3 〉	실패 (0.23ms, 72.3MB)
테스트 4 〉	실패 (0.23ms, 72.4MB)
테스트 5 〉	실패 (0.25ms, 73.9MB)
테스트 6 〉	실패 (0.27ms, 71.5MB)
테스트 7 〉	통과 (0.03ms, 71MB)
테스트 8 〉	실패 (0.31ms, 84.5MB)
테스트 9 〉	통과 (0.01ms, 72.7MB)
테스트 10 〉	통과 (0.35ms, 74.4MB)
테스트 11 〉	통과 (0.24ms, 74.2MB)
테스트 12 〉	통과 (0.03ms, 76.1MB)
테스트 13 〉	실패 (0.23ms, 76.9MB)
테스트 14 〉	통과 (0.03ms, 76.7MB)
테스트 15 〉	실패 (0.23ms, 75.6MB)
테스트 16 〉	실패 (0.25ms, 73.2MB)
테스트 17 〉	실패 (0.31ms, 75.8MB)
테스트 18 〉	실패 (0.30ms, 76.7MB)
 */
public class Programmers_62048 {
    public long solution(int w, int h) {
        long answer;

        Long width = (long) w;
        Long height = (long) h;

        answer = width*height - (width + height - getGreatestNum(width, height));

        return answer;
    }

    long getGreatestNum(long width, long height) {

        //작은값으로 큰값을 나누기 위해 구분하기
        long max = Math.max(width,height);
        long min = Math.min(width,height);

        while (min > 0) {
            long remain = max % min;

            max = min;
            min = remain;
        }

        return (max);
    }
}
