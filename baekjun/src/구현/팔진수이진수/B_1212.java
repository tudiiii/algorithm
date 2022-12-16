package 구현.팔진수이진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< numStr.length(); i++){
            int target = numStr.charAt(i) -'0';
            String binary = Integer.toBinaryString(target);

            if(binary.length()==2 && i!=0){
                sb.append("0").append(binary);
            }else if(binary.length()==1 && i!=0){
                sb.append("00").append(binary);
            }else {
                sb.append(binary);
            }
        }

        System.out.println(sb);

    }
}
