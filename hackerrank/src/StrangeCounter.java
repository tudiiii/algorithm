// Strange Counter

import java.util.HashMap;
import java.util.Map;

public class StrangeCounter {
    static long strangeCounter(long t) {

        Map<Long,Long> tv = new HashMap();
        long time = 1; long value =3; long tmp =3;
        while(true){

            tv.put(time, value);
            time++; value--;

            if(value==0){
                value = tmp * 2;
                tmp = value;
            }

            if(tv.containsKey(t)){
                return tv.get(t);
            }
        }
    }
}
