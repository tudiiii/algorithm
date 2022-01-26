package 키패드누르기;

public class Programmers_67256 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int remainder = 0;

        int leftIndex = 10;
        int rightIndex =12;
        int a=0;
        int b=0;
        for(int i=0;i<numbers.length;i++){
            remainder = numbers[i] % 3;
            System.out.println(remainder);

            if(remainder==1){
                answer.append("L");
                leftIndex = numbers[i];
            }else if(remainder==0){
                answer.append("R");
                rightIndex = numbers[i];
            }else {
                System.out.println("left " + leftIndex + " , right" + rightIndex);
                a = Math.abs(numbers[i] - leftIndex%3+leftIndex/3);
                b = Math.abs(numbers[i] - rightIndex%3+rightIndex/3 );
                System.out.println(a +", " +b);
                if(a>b){
                    System.out.println("???");
                    answer.append("R");
                    rightIndex = numbers[i];
                }else if(a<b){
                    answer.append("L");
                    leftIndex = numbers[i];
                }else {
                    if(hand.equals("right")) {
                        answer.append("R");
                        rightIndex = numbers[i];
                    }else{
                        answer.append("L");
                        leftIndex = numbers[i];
                    }
                }
            }
        }

        return answer.toString();
    }
}
