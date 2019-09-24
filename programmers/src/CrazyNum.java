public class CrazyNum {
    public String solution(String s) {
        String answer = "";
        char tmp;
        int length = s.length();
        int count=0;

        for(int i=0;i<length;i++){
            tmp = s.charAt(i);

            if(tmp==' '){
                count=-1;
            }

            if(count%2==0) {
                answer += String.valueOf(tmp).toUpperCase();
            }else{
                answer += String.valueOf(tmp).toLowerCase();
            }

            count++;
        }

        return answer;
    }
}
