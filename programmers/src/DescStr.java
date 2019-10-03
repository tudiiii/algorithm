import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DescStr {

    public String solution(String s) {

        String[] arrays = s.split("");
        Arrays.sort(arrays, Collections.reverseOrder());

        return  String.join("",arrays);

    }
}
