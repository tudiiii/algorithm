public class CrazyNum2 {
    public String solution(String s) {
       String answer ="";
       String[] array = s.split("");
       int count = 0;

       for(String a:array){
            count = a.contains(" ") ? 0 : count+1;
            answer += count%2==0 ? a.toLowerCase() : a.toUpperCase();
       }

        return answer;
    }
}
