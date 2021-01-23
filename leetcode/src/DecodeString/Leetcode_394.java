package DecodeString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Runtime: 7 ms
Memory Usage: 37.8 MB
 */
public class Leetcode_394 {
    public String decodeString(String s) {

        StringBuilder sb = new StringBuilder();
        StringBuilder flag = new StringBuilder("[");

        Pattern pattern = Pattern.compile("([0-9]+)\\[([a-z]*)]");
        Matcher matcher;

        while(flag.toString().contains("[")) {
            flag.setLength(0);
            matcher = pattern.matcher(s);
            while (matcher.find()) {
                String str = matcher.group();
                int num = Integer.parseInt(matcher.group(1));

                Pattern p = Pattern.compile("\\[(.*?)]");
                Matcher m = p.matcher(str);
                StringBuilder tmp = new StringBuilder();

                while (m.find()) {
                    tmp.append(m.group(1));
                }

                for (int i = 0; i < num; i++) {
                    sb.append(tmp);
                }

                s = s.replace(str, sb);
                flag.append(s);

                sb.setLength(0);
            }

        }

        return s;

    }
}
