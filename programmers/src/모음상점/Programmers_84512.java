package 모음상점;

public class Programmers_84512 {

    int orderNum = 0;

    public int solution(String word) {

        findWordDfs(0,"",word);

        return orderNum;
    }

    public boolean findWordDfs(int wordLength, String word, String findWord){

        if(findWord.equals(word)) return true;
        if(wordLength==5) return false;

        orderNum++;
        if(findWordDfs(wordLength+1, word+'A', findWord)) return true;
        orderNum++;
        if(findWordDfs(wordLength+1, word+'E', findWord)) return true;
        orderNum++;
        if(findWordDfs(wordLength+1, word+'I', findWord)) return true;
        orderNum++;
        if(findWordDfs(wordLength+1, word+'O', findWord)) return true;
        orderNum++;
        if(findWordDfs(wordLength+1, word+'U', findWord)) return true;

        return false;
    }
}
