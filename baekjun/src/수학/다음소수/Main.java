package 수학.다음소수;

/*
    다음소수 https://www.acmicpc.net/problem/4134
    메모리 	103952KB	시간  924ms
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            long tmp = Long.parseLong(br.readLine());
            bw.write(findPrimeNumber(BigInteger.valueOf(tmp))+ "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static BigInteger findPrimeNumber(BigInteger num){

        if(num.isProbablePrime(10)){
            return num;
        }else{
            return num.nextProbablePrime();
        }
    }
}
