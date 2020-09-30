public class Programmers_42883 {
    public String solution(String number, int k) {
        StringBuilder an = new StringBuilder(number);

        int deleteCnt = 0;
        int i =0;

        while(deleteCnt!=k){
            if(an.charAt(i)<an.charAt(i+1) ){
                an.deleteCharAt(i);
                deleteCnt++;
            }else if(an.charAt(i)>an.charAt(i+1)) {
                an.deleteCharAt(i + 1);
                deleteCnt++;
            }else{
                i++;
            }
            if (i >= 1) {
                i++;
            }
        }

        return an.toString();
    }
}
