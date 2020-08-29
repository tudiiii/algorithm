public class Leetcode_121 {
    public int maxProfit(int[] prices) {

        int price = 0;
        int maxPrice = 0;
        int length = prices.length;

        for(int i=0;i<length;i++){
            for(int j=1;j<length;j++){
                price = prices[j]-prices[i];
                if(price>maxPrice && i<j){
                    maxPrice = prices[j]-prices[i];
                }
            }
        }

        return maxPrice;

    }
}
