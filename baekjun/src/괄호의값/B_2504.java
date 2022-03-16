package 괄호의값;

import java.util.Stack;

public class B_2504 {

    public static int solution(String bracket){

        if(validateString(bracket)){
            return sumBracket(bracket);
        }else{
            return 0;
        }
    }

    public static boolean validateString(String bracket){
        String[] split = bracket.split("");
        Stack<String> stack = new Stack<>();

        for(String s : split){
            if(stack.isEmpty()) {
                stack.push(s);
                continue;
            }

            if(stack.peek().equals("(") &&s.equals(")")){
                stack.pop();
            }else if(stack.peek().equals("[") &&s.equals("]")){
                stack.pop();
            }else {
                stack.push(s);
            }
        }

        return stack.isEmpty();
    }

    public static int sumBracket(String bracket){
        String[] split = bracket.split("");
        int sum = 0;
        int tmp = 1;

        String str = "";

        for(String s : split){
            switch (s) {
                case "(":
                    tmp *= 2;
                    break;
                case "[":
                    tmp *= 3;
                    break;
                case ")":
                    if (!str.equals("]") && !str.equals(")"))
                        sum += tmp;
                    tmp /= 2;
                    break;
                case "]":
                    if (!str.equals("]") && !str.equals(")"))
                        sum += tmp;
                    tmp /= 3;
                    break;
            }

            str = s;
        }

        return sum;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String bracket = sc.nextLine();
//        System.out.println(solution(bracket));
//        sc.close();
//    }
}
