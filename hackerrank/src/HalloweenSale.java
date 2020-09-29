// Halloween Sale

public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        int answer = 0;
        int addCash = 0;

        while (true) {
            addCash += p; // 게임 가격

            if (addCash > s) break; // 가지고 있는 돈보다 크면

            answer++; // 살 수 있는 게임
            p -= d; // 할로윈 세일

            if (p < m) p = m; // m 보다 작으면 모든 게임이 m 가격
        }
        return answer;
    }
}
