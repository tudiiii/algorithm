import java.util.Arrays;
import java.util.Collections;

public class DescStr {

    public String solution(String s) {

        String[] arrays = s.split("");
        Arrays.sort(arrays, Collections.reverseOrder());

        return  String.join("",arrays);

    }
}
