package 베스트앨범;

import java.util.*;
/*
테스트 1 〉	실패 (런타임 에러)
테스트 2 〉	실패 (런타임 에러)
테스트 3 〉	통과 (0.86ms, 51.8MB)
테스트 4 〉	실패 (런타임 에러)
테스트 5 〉	실패 (1.64ms, 52.4MB)
테스트 6 〉	실패 (2.11ms, 53.2MB)
테스트 7 〉	실패 (2.97ms, 52.3MB)
테스트 8 〉	실패 (런타임 에러)
테스트 9 〉	실패 (런타임 에러)
테스트 10 〉	실패 (1.99ms, 52.9MB)
테스트 11 〉	실패 (런타임 에러)
테스트 12 〉	실패 (런타임 에러)
테스트 13 〉	실패 (2.04ms, 52.5MB)
테스트 14 〉	실패 (2.12ms, 52.2MB)
테스트 15 〉	실패 (0.90ms, 53MB)
 */
public class Programmers_42579 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<Integer, String> genreMap = new HashMap<>();
        HashMap<Integer, Integer> playMap = new HashMap<>();

        HashSet<String> playSet = new HashSet<>();

        for(int i=0;i<genres.length;i++){
            genreMap.put(i,genres[i]);
            playMap.put(i,plays[i]);
            playSet.add(genres[i]); // 장르 중복 제거
        }

        //장르별 총 플레이 횟수
        HashMap<Integer, String> genreCount = new HashMap<>();
        for(String x : playSet){
            int count = 0;
            for(int i = 0; i < genreMap.size(); i++){
                if(genreMap.get(i).equals(x)){
                    count+= playMap.get(i);
                }
            }
            genreCount.put(count, x);
        }

        ArrayList keySetList = new ArrayList<>(genreCount.keySet());
        keySetList.sort((o1, o2) -> (genreCount.get(o2).compareTo(genreCount.get(o1))));

        List<Integer> mapKey = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for(Object key : keySetList) {
            for(int i=0;i<genreMap.size();i++){
                if(genreMap.get(i).equals(genreCount.get(key))){
                    mapKey.add(playMap.get(i));
//                    System.out.println(genreCount.get(key) + " , "+ playMap.get(i) + " , " + i);
                }

            }
            mapKey.sort(Collections.reverseOrder());

            for(int i=0;i<2;i++){
                answerList.add(mapKey.get(i));
            }

            mapKey.clear();
//            System.out.println(answerList);
        }


        int[] answer = new int[playSet.size() *2];
        int count =0;
        for(Integer key : playMap.keySet()){
//            System.out.println(getKey(playMap,answerList.get(count)));
            answer[count] = getKey(playMap,answerList.get(count));

            count++;

            if(count == playSet.size() *2) break;
        }

        return answer;
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        // 찾을 hashmap 과 주어진 단서 value
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
