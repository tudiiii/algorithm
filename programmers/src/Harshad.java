public class Harshad {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;

        while(x != 0){
            sum += x%10; // 나머지
            x /= 10; // 몫
        }

        return num %  sum == 0;
    }
}
