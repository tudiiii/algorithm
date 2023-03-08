package 구현.빙고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2578 {

    static int[][] map = new int[5][5];
    static boolean bingo = false;
    static int count;
    static int say=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 빙고 입력
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());

                bingo(num);
            }
        }

    }

    private static void bingo(int num) {

        say++;

        for(int i = 0 ; i < 5 ; i++) {
            for(int j = 0 ; j < 5 ; j++) {
                if(map[i][j] == num) {
                    map[i][j] = 0;
                }
            }
        }

        bingoCheck();

        if(bingo){
            System.out.println(say);
            System.exit(0);
        }

        count=0;
    }

    private static void bingoCheck() {
        rightCheck();
        leftCheck();
        rightCrossCheck();
        leftCrossCheck();

        if(count>=3) bingo = true;
    }

    private static void rightCheck(){
        for(int i = 0 ; i < 5 ; i++) {
            int bingoCount = 0;

            for(int j = 0 ; j < 5 ;  j++) {
                if(map[i][j]==0) bingoCount++;
            }

            if(bingoCount == 5) count++;
        }
    }

    private static void leftCheck(){
        for(int i = 0 ; i < 5 ; i++) {
            int bingoCount = 0;

            for(int j = 0 ; j < 5 ;  j++) {
                if(map[j][i]==0) bingoCount++;
            }

            if(bingoCount == 5) count++;
        }
    }

    private static void rightCrossCheck() {
        int bingoCount = 0;

        for (int i = 0; i < 5; i++) {
            if(map[i][i]==0) bingoCount++;
        }

        if(bingoCount == 5) count++;
    }

    private static void leftCrossCheck() {
        int bingoCount = 0;

        for (int i = 0; i < 5; i++) {
            if(map[i][4-i]==0) bingoCount++;
        }

        if(bingoCount == 5) count++;
    }
}
