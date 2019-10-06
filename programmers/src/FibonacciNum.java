public class FibonacciNum {
    public int solution(int n) {
        int answer = 0;
        int num1 = 0, num2 = 1;

        for(int i=1;i<n;i++){
            answer = num1 + num2;
            num1= num2;
            num2=answer;
        }
        long answerLong = answer%1234567;

        return (int)answerLong%1234567;
    }
}
