package 자료구조.괄호;

import java.util.Scanner;
import java.util.Stack;

public class B_9012 {
    public static void main(String[] args) { // 메모리 18220KB	시간 240ms
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<size;i++){
            String bracket = sc.next();

            if(checkBracket(bracket)){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }

        }

        System.out.println(sb);
    }

    public static boolean checkBracket(String bracket){

        Stack<String> stack = new Stack<>();
        String[] split = bracket.split("");

        for(String s : split){
            if(s.equals("(")){
                stack.push("(");
            }else{
                if(stack.size()==0) return false;
                stack.pop();
            }

        }

        return stack.size()==0;
    }

}
