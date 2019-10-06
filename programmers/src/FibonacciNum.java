

public class FibonacciNum {
    public int solution(int n) {
        int answer = 0;
        int num1 = 0, num2 = 1;


        for(int i=2;i<=n;i++){
            answer = (num1 + num2)%1234567;
            num1= num2%1234567;
            num2=answer%1234567;
        }

        return answer;
    }

}
