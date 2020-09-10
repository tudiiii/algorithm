
public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        int answer = 0;
        int addCash = 0;
        while (true) {
            addCash += p;
            if (addCash > s)break;
            answer++;
            p -= d;
            if (p < m)p = m;
        }

        return answer;
    }

}
