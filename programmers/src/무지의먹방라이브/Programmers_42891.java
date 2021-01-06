package 무지의먹방라이브;
/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 52.5MB)
테스트 2 〉	통과 (0.02ms, 51.7MB)
테스트 3 〉	통과 (0.02ms, 52.6MB)
테스트 4 〉	통과 (0.02ms, 52.7MB)
테스트 5 〉	통과 (0.02ms, 52.1MB)
테스트 6 〉	통과 (0.02ms, 52.5MB)
테스트 7 〉	통과 (0.02ms, 51.6MB)
테스트 8 〉	통과 (0.02ms, 53MB)
테스트 9 〉	통과 (0.03ms, 52.9MB)
테스트 10 〉	통과 (0.03ms, 52.3MB)
테스트 11 〉	통과 (0.04ms, 52.3MB)
테스트 12 〉	통과 (0.03ms, 53.1MB)
테스트 13 〉	통과 (0.03ms, 53.1MB)
테스트 14 〉	통과 (0.03ms, 52.6MB)
테스트 15 〉	통과 (0.03ms, 52MB)
테스트 16 〉	통과 (0.02ms, 51.8MB)
테스트 17 〉	통과 (0.04ms, 52MB)
테스트 18 〉	통과 (0.04ms, 52.1MB)
테스트 19 〉	통과 (0.02ms, 52.9MB)
테스트 20 〉	통과 (0.02ms, 52.7MB)
테스트 21 〉	통과 (0.32ms, 52.4MB)
테스트 22 〉	통과 (0.29ms, 52.8MB)
테스트 23 〉	통과 (0.02ms, 52.7MB)
테스트 24 〉	통과 (1.02ms, 52.4MB)
테스트 25 〉	통과 (0.72ms, 52.3MB)
테스트 26 〉	통과 (2.54ms, 52.3MB)
테스트 27 〉	통과 (6.69ms, 52.1MB)
테스트 28 〉	통과 (0.03ms, 52.6MB)
테스트 29 〉	통과 (0.02ms, 52.8MB)
테스트 30 〉	통과 (0.03ms, 52.5MB)
테스트 31 〉	통과 (0.02ms, 53MB)
테스트 32 〉	통과 (0.03ms, 52.6MB)
효율성  테스트
테스트 1 〉	실패 (3.01ms, 62MB)
테스트 2 〉	실패 (3.08ms, 62MB)
테스트 3 〉	실패 (3.66ms, 61.7MB)
테스트 4 〉	실패 (2.61ms, 62.9MB)
테스트 5 〉	실패 (3.38ms, 63MB)
테스트 6 〉	실패 (3.09ms, 62.1MB)
테스트 7 〉	실패 (3.09ms, 62.8MB)
테스트 8 〉	실패 (3.17ms, 63.3MB)
 */
public class Programmers_42891 {
    public int solution(int[] food_times, long k) {
        int answer = 0;

        int index=0;
        int length = food_times.length;
        int sum =0;
        for (int food_time : food_times) {
            sum += food_time;
        }

        if(sum<=k){
            return -1;
        }

        while(true){
            for(int i=0;i<length;i++){
                if(food_times[i]!=0) {
                    //4,2,3,6,7,1,5,8
                    food_times[i]--;
                    System.out.println(food_times[i]);
                    index++;
                }

                if(index-1==k){
                    return i+1;
                }
            }

        }

    }
}
