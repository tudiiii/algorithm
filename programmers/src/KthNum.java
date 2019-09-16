import java.util.Arrays;

public class KthNum {

    public int[] solution(int[] array, int[][] commands){
        int length = commands.length;
        int[] answer = new int[length];
        int[] newArray;

        for(int i=0;i<length;i++){
            //배열잘라서 저장
            newArray = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(newArray); //정렬
            //인덱스는 0부터 시작하기 때문에 -1
            answer[i]=newArray[commands[i][2]-1];
        }
        return answer;
    }
}
