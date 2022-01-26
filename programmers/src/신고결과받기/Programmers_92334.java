package 신고결과받기;

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
