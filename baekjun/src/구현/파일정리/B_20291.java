package 구현.파일정리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* 메모리 64960	시간 820 */
public class B_20291 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine().split("\\.")[1];
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(String str : map.keySet()) {
            sb.append(str).append(" ").append(map.get(str)).append("\n");
        }

        System.out.println(sb);
    }
}
