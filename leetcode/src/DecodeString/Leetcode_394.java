package DecodeString;

public class Leetcode_394 {
    public String decodeString(String s) {
//        "3[a]2[bc]"),"aaabcbc"


        StringBuilder sb = new StringBuilder();
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        int count = 0;

        for(int i=0;i<s.length();i++){
            System.out.println("i " + i);
            char c = s.charAt(i);

           if(c >= '0' && c <= '9') {
                count = c - '0';
            }
           else if(c == '['){
               flag=true;
           }else if(c==']'){
               flag=false;
               for(int j=0;j<count;j++){
                   sb.append(str);
               }
               str.setLength(0);
           }
            else{
                if(flag){
                    str.append(c);
                }else{
                    sb.append(c);
                }
            }

        }

        System.out.println("sb " + sb);
        return sb.toString();

    }
}
