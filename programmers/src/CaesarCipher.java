public class CaesarCipher {
    public String solution(String s, int n) {
        int ascii[] = new int[s.length()];
        char chars[] = new char[s.length()];
        StringBuilder answer = new StringBuilder();


        for (int i = 0; i < chars.length; i++) {

            chars[i] = s.charAt(i);

            if (chars[i] > 64 && chars[i] < 91) {
                ascii[i] = chars[i] + n;
                if (ascii[i] > 90) {
                    ascii[i] = ascii[i] - 26;
                }
            }

            else if (chars[i] > 96 && chars[i] < 123) {
                ascii[i] = chars[i] + n;
                if (ascii[i] > 122) {
                    ascii[i] = ascii[i] - 26;
                }
            }

            else if (chars[i] == 32)
                ascii[i] = 32;

            answer.append(Character.toString((char) ascii[i]));
        }
        return answer.toString();
    }
}
