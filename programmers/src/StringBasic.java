public class StringBasic {
    public boolean solution(String s) {
        int length = s.length();
        if(length ==4 || length ==6 ){
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e){
                return false;
            }
        }
        return false;
    }
}
