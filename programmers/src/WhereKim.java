public class WhereKim {
    public String solution(String[] seoul) {
        String answer = "";

        String Kim = "Kim";

        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals(Kim)){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }

        return answer;
    }
}
