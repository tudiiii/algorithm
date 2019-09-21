public class CollatzGuess {
    public int solution(int num) {
        int answer = 0;
        long number = num;

        while(number!=1) {
            number = (number % 2==0) ? number /=2 : number * 3 +1;
            answer++;

           if(answer>=500){
                answer = -1;
                break;
            }
        }
        return answer;

    }
}
