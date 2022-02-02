package 키패드누르기;
/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 77MB)
테스트 2 〉	통과 (0.03ms, 74.3MB)
테스트 3 〉	통과 (0.04ms, 73.3MB)
테스트 4 〉	통과 (0.03ms, 77MB)
테스트 5 〉	통과 (0.05ms, 71.1MB)
테스트 6 〉	통과 (0.04ms, 76.8MB)
테스트 7 〉	통과 (0.03ms, 77.2MB)
테스트 8 〉	통과 (0.06ms, 73.6MB)
테스트 9 〉	통과 (0.03ms, 74.9MB)
테스트 10 〉	통과 (0.04ms, 75.8MB)
테스트 11 〉	통과 (0.04ms, 77.1MB)
테스트 12 〉	통과 (0.05ms, 73.1MB)
테스트 13 〉	통과 (0.06ms, 76.1MB)
테스트 14 〉	통과 (0.07ms, 77.1MB)
테스트 15 〉	통과 (0.12ms, 74.9MB)
테스트 16 〉	통과 (0.12ms, 76.3MB)
테스트 17 〉	통과 (0.32ms, 78.8MB)
테스트 18 〉	통과 (0.20ms, 72.9MB)
테스트 19 〉	통과 (0.20ms, 74.1MB)
테스트 20 〉	통과 (0.19ms, 78.1MB)
 */
public class Programmers_67256 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int leftIndex = 10;
        int rightIndex =12;

        for (int number : numbers) {
            if(number==0) number=11;

            int remainder = number % 3;

            if (remainder == 1) {
                leftIndex = number;
                answer.append("L");
            } else if (remainder == 0) {
                rightIndex = number;
                answer.append("R");
            } else {
                int minusL = Math.abs(number - leftIndex);
                int minusR = Math.abs(number - rightIndex);

                int distanceL = (minusL % 3) + (minusL / 3);
                int distanceR = (minusR % 3) + (minusR / 3);

                if (distanceL < distanceR) {
                    answer.append("L");
                    leftIndex = number;
                } else if (distanceR < distanceL) {
                    answer.append("R");
                    rightIndex = number;
                } else {
                    answer.append(hand.equals("right") ? "R" : "L");
                    if (hand.equals("right")) rightIndex = number;
                    else leftIndex = number;
                }
            }

        }

        return answer.toString();
    }
}
