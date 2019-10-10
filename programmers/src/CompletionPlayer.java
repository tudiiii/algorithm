import java.util.HashMap;
import java.util.Map;

public class CompletionPlayer {
    private void insertPart(String[] participant, Map<String,Integer> runnerHash){
        for (String runner:participant) {
            if(runnerHash.get(runner)==null){
                runnerHash.put(runner,1);
            }else{
                runnerHash.put(runner,runnerHash.get(runner)+1);
            }
        }
    }

    private void findComplete(String[] completion, Map<String,Integer> runnerHash){
        for(String runner:completion){
            runnerHash.put(runner,runnerHash.get(runner)-1);
        }
    }

    private String getAnswer(Map<String,Integer> runnerHash){
        for(String runner:runnerHash.keySet()){
            if(runnerHash.get(runner)==1){
                return runner;
            }
        }
        return  null;
    }

    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> runnerHash = new HashMap<>();
        insertPart(participant,runnerHash);
        findComplete(completion,runnerHash);

        return getAnswer(runnerHash);
    }
}