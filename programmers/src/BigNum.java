import java.util.*;

public class BigNum {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> strings = new ArrayList<>();

        for(int num : numbers){
            strings.add(String.valueOf(num));
        }

        strings.sort(((o1,o2)->(o2 + o1).compareTo(o1 + o2)));

        for(String s:strings){
            answer += s;
        }
        // 0인경우
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
