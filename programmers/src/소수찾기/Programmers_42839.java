package 소수찾기;

import java.util.HashSet;

public class Programmers_42839 {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();

        perm("",numbers, set); // 순열

        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }

        return count;
    }

    public static void perm(String prefix, String str, HashSet<Integer> set){
        int n = str.length();

        if(!prefix.equals("")){
            set.add(Integer.valueOf(prefix));
        }

        for ( int i=0 ; i < n ; i++ ){
            perm(prefix+str.charAt(i),str.substring(0, i) + str.substring(i+1,n),set);
        }
    }

    public boolean isPrime(int n){
        if(n==0 || n==1) return false;

        for(int i=2 ; i<Math.sqrt(n) ; i+=i){
            if(n%i==0) return false;
        }

        return true;
    }
}
