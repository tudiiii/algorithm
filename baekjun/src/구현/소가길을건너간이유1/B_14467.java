package 구현.소가길을건너간이유1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_14467 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] cows = new int[11];
        int cnt =0;

        for (int i = 1; i < 11; i++) {
            cows[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int cowNum = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());

            if(cows[cowNum]==-1) {
                cows[cowNum] = location;
            }else if(cows[cowNum]!=location){
                cows[cowNum] = location;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
