package 수들의합;

public class B_1789 {
    public static int searchNum (long num){

        long sum = 0;
        int i =0;

        while(num>=sum){
            sum += (++i);
        }

        return i-1;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long num = sc.nextLong();
//        System.out.println(searchNum(num));
//        sc.close();
//    }
}
