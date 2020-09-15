// Strange Counter

public class StrangeCounter {
    static long strangeCounter(long t) {

        long time = 3;
        long num = 6;

        // value가 1이 될 때 포함되는 사이클 주기 구하기 ( 만약 time이 15일 때, 그 사이클의 value가 1인 time은 21 )
        while(t>time){ // time 3 -> 9 -> 21 -> 45
            time += num;
            num *= 2;
        }

        // value가 1인 값을 구한 후 t+1만큼빼면 t의 value 값을 구 할 수 있음
        // 21 - 15 + 1 = 7
        return time-t+1;
    }

}
