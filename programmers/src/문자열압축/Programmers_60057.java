package 문자열압축;

public class Programmers_60057 {
    public int solution(String s) {
        int answer = s.length();

        for(int i=0;i<=s.length()/2;++i){
            int pos = 0;
            int len = s.length();

            for( ; pos+i <= s.length() ;){
                String unit = s.substring(pos, pos + i);
                pos += i;

                int count = 0;
                for ( ; pos+i <= s.length() ; ){
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
