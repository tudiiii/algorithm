package 이진변환반복하기;

public class Programmers_70129 {
    public int[] solution(String s) {
        int zeroCount = 0;
        int count = 0;

        String binary = s;
        int length = s.length(); // 총 길이
        while (binary.length() != 1) {
            binary = binary.replace("0", "");
            zeroCount += length - binary.length();

            binary = Integer.toBinaryString(binary.length());
            length = binary.length();
            count++;
        }

        return new int[]{count, zeroCount};
    }
}
