package PalindromicSubstrings;

/*
Runtime: 4 ms
Memory Usage: 38.8 MB
 */
public class Leetcode_647 {
    int count = 0;

    public int countSubstrings(String s) {

        for(int i=0;i<s.length();i++){
            checkPalinromic(s, i, i);
            checkPalinromic(s ,i, i+1);
        }

        return count;
    }

    public void checkPalinromic(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            System.out.println("=====" + left + " , " + right);
            count++;
            left--;
            right++;
        }
    }
}
