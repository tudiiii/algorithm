package 문자열압축;
/*
정확성  테스트
테스트 1 〉	통과 (0.06ms, 52.7MB)
테스트 2 〉	통과 (0.25ms, 52MB)
테스트 3 〉	통과 (0.18ms, 53.3MB)
테스트 4 〉	통과 (0.04ms, 52.6MB)
테스트 5 〉	통과 (0.02ms, 52.1MB)
테스트 6 〉	통과 (0.08ms, 54.1MB)
테스트 7 〉	통과 (0.32ms, 52.5MB)
테스트 8 〉	통과 (0.46ms, 55.4MB)
테스트 9 〉	통과 (0.49ms, 52.7MB)
테스트 10 〉	통과 (1.73ms, 53.5MB)
테스트 11 〉	통과 (0.13ms, 52.3MB)
테스트 12 〉	통과 (0.09ms, 51.9MB)
테스트 13 〉	통과 (0.12ms, 52MB)
테스트 14 〉	통과 (0.54ms, 53.2MB)
테스트 15 〉	통과 (0.11ms, 52.2MB)
테스트 16 〉	통과 (0.04ms, 52.8MB)
테스트 17 〉	통과 (0.93ms, 52.3MB)
테스트 18 〉	통과 (0.83ms, 54MB)
테스트 19 〉	통과 (0.74ms, 53.1MB)
테스트 20 〉	통과 (1.98ms, 53.9MB)
테스트 21 〉	통과 (2.04ms, 53.4MB)
테스트 22 〉	통과 (1.95ms, 53.6MB)
테스트 23 〉	통과 (2.12ms, 54.1MB)
테스트 24 〉	통과 (1.82ms, 53.4MB)
테스트 25 〉	통과 (1.59ms, 53.7MB)
테스트 26 〉	통과 (2.25ms, 54.1MB)
테스트 27 〉	통과 (2.03ms, 53.4MB)
테스트 28 〉	통과 (0.06ms, 52.7MB)
 */
public class Programmers_60057 {
    public int solution(String s) {
        int answer = s.length();

        for(int i=1;i<=s.length()/2;++i){
            int pos = 0;
            int len = s.length();

            while (pos+i <= s.length()) {
                String unit = s.substring(pos, pos + i);
                pos += i;

                int count = 0;
                while (pos+i <= s.length()) {
                    if(unit.equals(s.substring(pos,pos+i))){
                        ++count;
                        pos += i;
                    }else{
                        break;
                    }
                }

                if(count > 0){
                    len -= i * count;

                    if(count < 9) len += 1;
                    else if(count < 99) len += 2;
                    else if(count < 999) len += 3;
                    else len += 4;
                }
            }
            answer = Math.min(answer,len);

        }

        return answer;
    }
}
