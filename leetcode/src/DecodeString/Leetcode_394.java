package DecodeString;

public class Leetcode_394 {
    public String decodeString(String s) {
//        ("3[a2[c]]"),"accaccacc");

        StringBuilder sb = new StringBuilder();
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        boolean isNumber = false;
        int count = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

           if(c >= '0' && c <= '9') {
               if(isNumber && !flag){
                   count = count * 10 + c - '0';
               }
               if(!isNumber && !flag){
                   count = c - '0';
               }
               isNumber = true;
            }
           else if(c == '['){
               if(flag){
                   int z = i;
                   int tmp = s.charAt(z-1) - '0';
                   StringBuilder re = new StringBuilder();
                   while(z<s.length()){
                       if(s.charAt(z)==']') {
                           break;
                       }
                       if(s.charAt(z)!='['){
                           re.append(s.charAt(z));
                       }
                       z++;
                   }

                   for(int j=0;j<tmp;j++){
                       System.out.println(j);
                       str.append(re);
                   }
                   i = z+re.length()-1;
                   System.out.println("i---- " + i);
               }
               flag=true;
               isNumber=false;
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

            System.out.println("count " + count);
        }
        System.out.println("sb " + sb);
        return sb.toString();

    }
}
