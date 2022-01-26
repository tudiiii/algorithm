package 신고결과받기;
/*
정확성  테스트
테스트 1 〉	통과 (0.21ms, 71.2MB)
테스트 2 〉	통과 (0.37ms, 71.8MB)
테스트 3 〉	통과 (263.95ms, 198MB)
테스트 4 〉	통과 (0.40ms, 75.6MB)
테스트 5 〉	통과 (0.43ms, 72.7MB)
테스트 6 〉	통과 (4.82ms, 79.7MB)
테스트 7 〉	통과 (5.82ms, 81.6MB)
테스트 8 〉	통과 (8.85ms, 96.2MB)
테스트 9 〉	통과 (119.75ms, 140MB)
테스트 10 〉	통과 (122.13ms, 132MB)
테스트 11 〉	통과 (230.15ms, 195MB)
테스트 12 〉	통과 (2.05ms, 78.3MB)
테스트 13 〉	통과 (2.74ms, 80.1MB)
테스트 14 〉	통과 (115.61ms, 144MB)
테스트 15 〉	통과 (149.85ms, 161MB)
테스트 16 〉	통과 (2.27ms, 74.3MB)
테스트 17 〉	통과 (1.82ms, 77MB)
테스트 18 〉	통과 (3.41ms, 74.6MB)
테스트 19 〉	통과 (4.82ms, 80.8MB)
테스트 20 〉	통과 (140.30ms, 140MB)
테스트 21 〉	통과 (189.25ms, 166MB)
테스트 22 〉	통과 (0.24ms, 73.5MB)
테스트 23 〉	통과 (0.20ms, 75.4MB)
테스트 24 〉	통과 (0.20ms, 77.6MB)
 */
import java.util.*;

public class Programmers_92334 {
    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String, Integer> idMap = new HashMap<>();
        Map<String, Integer> reportIdMap = new HashMap<>();
        List<String> userId = new ArrayList<>();
        List<String> reportId = new ArrayList<>();
        Map<String, Integer> reportCount = new HashMap<>();

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        String[] resultReport = hashSet.toArray(new String[0]);

        for(String id : id_list){
            idMap.put(id,0);
            reportCount.put(id,0);
        }

        for(String id : resultReport){
            userId.add(id.split(" ")[0]);
            reportId.add(id.split(" ")[1]);
        }

        for (String s : reportId) {
            if (idMap.containsKey(s)) {
                idMap.put(s, idMap.get(s) + 1);
            }

            if (idMap.get(s) >= k) {
                reportIdMap.put(s, idMap.get(s));
            }
        }

        for(int i=0;i<reportId.size();i++){
            if(reportIdMap.containsKey(reportId.get(i))){
                if(idMap.containsKey(userId.get(i))){
                    reportCount.put(userId.get(i), reportCount.get(userId.get(i)) + 1);
                }
            }
        }

        int[] count = new int[id_list.length];
        int i=0;

        for(String id : id_list) {
            count[i] = reportCount.get(id);
            i++;
        }
        return count;
    }
}
