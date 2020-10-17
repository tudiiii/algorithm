/*
43. Multiply Strings
Runtime: 8 ms
Memory Usage: 39.6 MB
 */
public class Leetcode_43 {
    public String multiply(String num1, String num2) {

        int numLength1 = num1.length();
        int numLength2 = num2.length();
        int[] length = new int[numLength1 + numLength2]; // 두 수의 곱의 자릿수 == 자릿수 + 자릿수

        for(int i = numLength1 - 1; i >= 0; i--) {
            for(int j = numLength2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int digit1 = i + j;
                int digit2 = i + j + 1;

                int sum = mul + length[digit2];

                length[digit1] += sum / 10;
                length[digit2] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int p : length){
            if(!(sb.length() == 0 && p == 0)) sb.append(p);
        }

        if(sb.length()==0) return "0";
        else return sb.toString();

    }
}
