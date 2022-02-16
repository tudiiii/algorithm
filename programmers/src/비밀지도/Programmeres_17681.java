package 비밀지도;
/*
정확성  테스트
테스트 1 〉	통과 (6.19ms, 77.1MB)
테스트 2 〉	통과 (6.81ms, 78.3MB)
테스트 3 〉	통과 (8.17ms, 76.7MB)
테스트 4 〉	통과 (9.30ms, 78.1MB)
테스트 5 〉	통과 (6.15ms, 74.6MB)
테스트 6 〉	통과 (7.65ms, 69.5MB)
테스트 7 〉	통과 (8.90ms, 78.2MB)
테스트 8 〉	통과 (7.15ms, 78MB)
 */

public class Programmeres_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0;i<n;i++){
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            str = String.format("%"+n+"s", str);
            str= str.replace("1","#");
            str = str.replace("0"," ");

            answer[i]= str;
        }

        return answer;
    }
}
