package JadenCase문자열만들기;

public class Programmers_12951 {
    public String solution(String s) {
        StringBuilder str = new StringBuilder();
        String[] tokens = s.split(" ");
        int index = 0;

        for (String token : tokens) {
            index++;
            if (token.length() == 0) {
                str.append(" ");
                continue;
            }

            str.append(makeJadenCase(token));
            str.append(" ");
        }

        if (s.endsWith(" ")) {
            return str.toString();
        }

        return str.substring(0, s.length());
    }

    private String makeJadenCase(String token) {
        String first = token.substring(0, 1);
        String remainString = token.substring(1);

        return first.toUpperCase()+remainString.toLowerCase();
    }
}
