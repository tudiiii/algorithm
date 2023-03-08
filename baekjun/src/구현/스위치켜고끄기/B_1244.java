package 구현.스위치켜고끄기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1244 {

    static int N;
    static boolean[] bulb;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        bulb = new boolean[N+1];
        for (int i = 1; i <= N; i++) {
            bulb[i] = !"1".equals(st.nextToken());
        }

        count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(s==1) boy(m);
            else if(s==2) girl(m);
        }

        StringBuilder sb = new StringBuilder();
        int cnt =0;

        for (int i = 1; i <= N; i++) {

            if(i!=1 && cnt%20==0) sb.append(System.getProperty("line.separator"));

            if (bulb[i])
                sb.append("0").append(' ');
            else
                sb.append("1").append(' ');

            cnt++;
        }

        System.out.println(sb);


    }
    
    private static void boy(int num){
        for (int i = num; i <= N; i+=num) {
            bulb[i] = !bulb[i];
        }
    }
    
    private static void girl(int num){

        bulb[num] = !bulb[num];

        int left = num - 1;
        int right = num + 1;

        while(left>0 && right<=N){
            if( bulb[left] == bulb[right] ){
                bulb[left] = !bulb[left];
                bulb[right] = !bulb[right];
                left -= 1;
                right += 1;
            }else{
                break;
            }

        }
    }
}
