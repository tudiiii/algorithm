package N으로표현;

public class Programmers_42895 {

    static int num = -1;
    public int solution(int N, int number) {

        calculation(N,number,0,0);

        return num;
    }

    public void calculation(int N, int number,int count, int result){

        int NN = N;

        if(count>8){
            num = -1;
            return;
        }
        if(result==number){
            if(num== -1 || num >count)
                num = count;
            return;
        }

        for(int i=1;i<9-count;i++){
            calculation(N,number,count+i,result+NN);
            calculation(N,number,count+i,result-NN);
            calculation(N,number,count+i,result*NN);
            calculation(N,number,count+i,result/NN);
            NN = NN * 10 + N;
        }
    }
}
