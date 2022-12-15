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

    }

    public int bnp() {

        return 1;
    }

    public int timing() {

        return 1;
    }
}
