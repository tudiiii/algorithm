package 신규아이디추천;
/*
정확성  테스트
테스트 1 〉	통과 (0.19ms, 51.7MB)
테스트 2 〉	통과 (0.20ms, 52.2MB)
테스트 3 〉	통과 (0.25ms, 52.9MB)
테스트 4 〉	통과 (0.28ms, 52.6MB)
테스트 5 〉	통과 (0.23ms, 52.5MB)
테스트 6 〉	통과 (0.17ms, 52.3MB)
테스트 7 〉	통과 (0.18ms, 52.1MB)
테스트 8 〉	통과 (0.26ms, 52.5MB)
테스트 9 〉	통과 (0.23ms, 52.4MB)
테스트 10 〉	통과 (0.18ms, 52MB)
테스트 11 〉	통과 (0.20ms, 51.9MB)
테스트 12 〉	통과 (0.41ms, 52.2MB)
테스트 13 〉	통과 (0.50ms, 53MB)
테스트 14 〉	통과 (0.29ms, 51.5MB)
테스트 15 〉	통과 (0.38ms, 53.7MB)
테스트 16 〉	통과 (0.58ms, 53.9MB)
테스트 17 〉	통과 (1.39ms, 53MB)
테스트 18 〉	통과 (3.70ms, 54.2MB)
테스트 19 〉	통과 (3.41ms, 52.4MB)
테스트 20 〉	통과 (4.65ms, 52.8MB)
테스트 21 〉	통과 (2.90ms, 53.3MB)
테스트 22 〉	통과 (4.63ms, 53MB)
테스트 23 〉	통과 (3.57ms, 52MB)
테스트 24 〉	통과 (2.94ms, 52.1MB)
테스트 25 〉	통과 (2.01ms, 51.8MB)
테스트 26 〉	통과 (6.94ms, 52.7MB)
 */
public class Programmers_772410 {
    public String solution(String new_id) {

        new_id = new_id.toLowerCase();

        new_id = new_id.replaceAll("[^a-z0-9-_.]", "")
                .replaceAll("\\.{2,}",".");

        if(new_id.charAt(0)=='.'){
            new_id = new_id.substring(1);
        }

        if(!"".equals(new_id) && new_id.charAt(new_id.length()-1)=='.'){
            new_id = new_id.substring(0,new_id.length()-1);
        }

        if("".equals(new_id)) new_id = "a";

        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1) == '.'){
                new_id = new_id.substring(0,new_id.length()-1);
            }
        }

        if(new_id.length()<=2){
            StringBuilder new_idBuilder = new StringBuilder(new_id);
            while(new_idBuilder.length()<3){
                new_idBuilder.append(new_idBuilder.charAt(new_idBuilder.length() - 1));
            }
            new_id = new_idBuilder.toString();
        }

        return new_id;
    }
}
