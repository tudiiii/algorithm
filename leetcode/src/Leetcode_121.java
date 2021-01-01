public class Leetcode_121 {
    public static int maxProfitY(int[] price) {

        int buy = 0;
        int sell = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < price.length; i++) {
            if (min > price[i]) {        //배열의 최소값 찾음 (사는날)
                min = price[i];
                buy = i;
            }
        }

        int max = price[buy];

        for (int j = buy; j < price.length - buy; j++) {
            if (max < price[j]) {        //파는 날 구하기
                max = price[j];
                sell = j;
            }
        }

        System.out.println("buy=" + buy);
        System.out.println("sell=" + sell);
        System.out.println("max = " + max);
        System.out.println("min= " + min);


        if (buy == price.length - 1) {
            return 0;
        } else {

            int result = max - min;

            return result;
        }
    }

    public int maxProfit(int[] prices) {

        int price = 0;
        int maxPrice = 0;
        int length = prices.length;

        for(int i=0;i<length;i++){
            for(int j=1;j<length;j++){

                price = prices[j]-prices[i];

                if(price>maxPrice && i<j){
                    maxPrice = price;
                }

            }
        }

        return maxPrice;
    }
}
