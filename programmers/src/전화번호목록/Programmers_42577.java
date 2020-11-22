package 전화번호목록;

import java.util.Arrays;

public class Programmers_42577 {

/*
정확성  테스트
테스트 1 〉	통과 (0.24ms, 52.9MB)
테스트 2 〉	통과 (0.22ms, 52.3MB)
테스트 3 〉	통과 (0.25ms, 53.4MB)
테스트 4 〉	통과 (0.24ms, 52.8MB)
테스트 5 〉	통과 (0.25ms, 52.8MB)
테스트 6 〉	통과 (0.22ms, 53.3MB)
테스트 7 〉	통과 (0.22ms, 51.8MB)
테스트 8 〉	통과 (0.17ms, 51.9MB)
테스트 9 〉	통과 (0.22ms, 52.2MB)
테스트 10 〉	통과 (0.25ms, 52.2MB)
테스트 11 〉	통과 (0.23ms, 51.9MB)
효율성  테스트
테스트 1 〉	통과 (23.24ms, 56.9MB)
테스트 2 〉	통과 (18.64ms, 56.8MB)
 */
    public boolean solution(String[] phone_book) {

        int length = phone_book.length;
        Arrays.sort(phone_book);

        for(int i=0;i<length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }

        return true;
    }

/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 52.4MB)
테스트 2 〉	통과 (0.02ms, 53.1MB)
테스트 3 〉	통과 (0.02ms, 53MB)
테스트 4 〉	통과 (0.02ms, 51.8MB)
테스트 5 〉	통과 (0.04ms, 54.1MB)
테스트 6 〉	통과 (0.02ms, 52.3MB)
테스트 7 〉	통과 (0.02ms, 52.6MB)
테스트 8 〉	통과 (0.02ms, 53MB)
테스트 9 〉	통과 (0.02ms, 52MB)
테스트 10 〉	통과 (0.02ms, 52MB)
테스트 11 〉	통과 (0.04ms, 53.1MB)
효율성  테스트
테스트 1 〉	통과 (1.96ms, 57.1MB)
테스트 2 〉	통과 (1.51ms, 59.5MB)
 */
    public boolean solution2(String[] phone_book) {

        for (String book : phone_book) {
            for (String b : phone_book) {
                if (book.length() < b.length()) {
                    if (b.startsWith(book)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
