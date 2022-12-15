package 구현.최소최대2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_20053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int totalSize = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= totalSize; tc++){
            StringBuilder sb = new StringBuilder();
            int size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < size; i++){
                int num = Integer.parseInt(st.nextToken());
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
            sb.append(min).append(' ').append(max);
            System.out.println(sb);
        }
    }
}
