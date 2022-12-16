package 구현.전구;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_21918 {

    static int bulbSize, mission;
    static int[] bulb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        bulbSize = Integer.parseInt(st.nextToken());
        mission = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        bulb = new int[bulbSize+1];

        for (int i = 1; i <= bulbSize; i++) {
            bulb[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < mission; j++) {
            st = new StringTokenizer(br.readLine());
            int tmpA = Integer.parseInt(st.nextToken());
            int tmpB = Integer.parseInt(st.nextToken());
            int tmpC = Integer.parseInt(st.nextToken());

            switch (tmpA) {
                case 1 :
                    func1(tmpB,tmpC);
                    break;
                case 2 :
                    func2(tmpB,tmpC);
                    break;
                case 3 :
                    func3(tmpB,tmpC);
                    break;
                case 4 :
                    func4(tmpB,tmpC);

                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= bulbSize; i++)
            sb.append(bulb[i]).append(' ');

        System.out.println(sb);
    }

    private static void func1(int tmpB, int tmpC) {
        bulb[tmpB] = tmpC;
    }

    private static void func2(int tmpB, int tmpC) {

        for(int i=tmpB; i<=tmpC ; i++) {
            bulb[i]^=1;
        }
    }

    private static void func3(int tmpB, int tmpC) {
        for(int i=tmpB; i<=tmpC ; i++) {
            bulb[i]=0;
        }
    }

    private static void func4(int tmpB, int tmpC) {
        for(int i=tmpB; i<=tmpC ; i++) {
            bulb[i]=1;
        }
    }
}
