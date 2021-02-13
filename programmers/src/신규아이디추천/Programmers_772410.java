package 신규아이디추천;
/*
정확성  테스트
테스트 1 〉	통과 (0.15ms, 52.4MB)
테스트 2 〉	통과 (13.61ms, 52.8MB)
테스트 3 〉	통과 (22.55ms, 53.3MB)
테스트 4 〉	통과 (0.40ms, 52.3MB)
테스트 5 〉	통과 (0.66ms, 55.7MB)
테스트 6 〉	통과 (0.18ms, 52.1MB)
테스트 7 〉	통과 (0.21ms, 52.4MB)
테스트 8 〉	통과 (0.26ms, 52.1MB)
테스트 9 〉	통과 (13.43ms, 54MB)
테스트 10 〉	통과 (0.18ms, 52.4MB)
테스트 11 〉	통과 (0.22ms, 52.6MB)
테스트 12 〉	통과 (0.36ms, 51.7MB)
테스트 13 〉	통과 (13.79ms, 52.5MB)
테스트 14 〉	통과 (0.32ms, 52MB)
테스트 15 〉	통과 (0.37ms, 52.7MB)
테스트 16 〉	통과 (0.58ms, 52.3MB)
테스트 17 〉	통과 (1.38ms, 52.2MB)
테스트 18 〉	통과 (1.99ms, 53.7MB)
테스트 19 〉	통과 (2.87ms, 52.1MB)
테스트 20 〉	통과 (4.34ms, 53.1MB)
테스트 21 〉	통과 (3.62ms, 52.3MB)
테스트 22 〉	통과 (25.89ms, 53.9MB)
테스트 23 〉	통과 (18.06ms, 53.5MB)
테스트 24 〉	통과 (4.89ms, 51.8MB)
테스트 25 〉	통과 (2.85ms, 52.5MB)
테스트 26 〉	통과 (2.94ms, 52.1MB)
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
            while(new_id.length()<3){
                new_id += new_id.charAt(new_id.length()-1);
            }
        }

        return new_id;
    }
}
