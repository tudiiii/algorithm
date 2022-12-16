package 구현.기적의매매법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_20546 {

    static int n;
    static int[] price;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st= new StringTokenizer(br.readLine());
        price = new int[14];
        for (int i = 0; i < 14; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        int bnp = bnp();
        int timing = timing();

        if(bnp>timing) System.out.println("BNP");
        else if(bnp<timing) System.out.println("TIMING");
        else System.out.println("SAMESAME");
    }

    public static int bnp() {

        int jCnt = 0;
        int money = n;

        for (int j : price) {
            if (j <= money) {
                int cnt = money / j;
                money -= j * cnt;
                jCnt += cnt;
            }
        }

        return jCnt*price[13]+money;
    }

    public static int timing() {

        int sCnt = 0;
        int money = n;

        for (int j= 0; j < price.length; j++) {
            if(j<3) continue;

            if (price[j-3]>price[j-2] && price[j-2]>price[j-1]){
                int cnt = money / price[j];
                money -= price[j] * cnt;
                sCnt += cnt;
            }

            if (price[j-3]<price[j-2] && price[j-2]<price[j-1]){
                money += sCnt * price[j];
                sCnt=0;
            }
        }

        return sCnt*price[13]+money;
    }
}
