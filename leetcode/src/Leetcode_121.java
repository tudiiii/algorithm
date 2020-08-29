public class Leetcode_121 {
    public int maxProfit(int[] prices) {

        int maxPrice = 0;
        int length = prices.length;

        for(int i=0;i<length;i++){
            for(int j=1;j<length;j++){
                if(prices[j]-prices[i]>maxPrice && i<j){
                    maxPrice = prices[j]-prices[i];
                }
            }
        }

        return maxPrice;

    }
}
