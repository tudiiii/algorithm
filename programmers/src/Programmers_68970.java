public class Programmers_68970 {
    public int[] solution(int n, String[] words) {
        int[] answer = {};

        int count = 0;
        while(!(count==words.length)) {
            String word = words[count];
            for (int i = count; i < words.length; i++) {
                if (word.equals(words[i])) {
                    return new int[]{};
                }
            }
            count++;
        }

        return answer;
    }
}
