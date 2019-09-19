public class SmallestNumBye {

    public int[] solution(int[] arr) {
        //int length = arr.length;
        int[] answer = {};
        int min = arr[0];
        int num=0;

        if(arr.length==1){
            return new int[]{-1};
        }

        for(int i=1;i<arr.length-1;i++){
            if (arr[i] < min) {
                answer[num++] += min;
                min = arr[i];
            }
            else {
                return answer;
            }
        }
        return answer;
    }
}
