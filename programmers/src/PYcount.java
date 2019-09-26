import java.util.Arrays;

public class PYcount {

    boolean solution(String s) {

        boolean answer = true;
        int pcount=0, ycount=0;
        char[] temp = s.toCharArray();
        int length = temp.length;

        for(int i =0; i<length; i++) {
            if(temp[i]=='p'||temp[i]=='P') {
                pcount++;
            }else if(temp[i]=='y'||temp[i]=='Y') {
                ycount++;
            }
        }
        if(pcount==ycount) {
            return true;
        }else {
            return false;
        }
    }

}
