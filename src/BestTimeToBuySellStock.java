public class BestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_value = prices[0];

        for (int i=1; i<prices.length; i++) {
            // does it make sense to sell at the current price
            max_profit = Math.max(max_profit, prices[i]-min_value);
            // is it the min values that we saw
            min_value = Math.min(min_value, prices[i]);
        }
        return max_profit;

    }

    public static void main(String[] args) {
//        int res = BestTimeToBuySellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        int res = BestTimeToBuySellStock.maxProfit(new int[]{2,4,1});

        System.out.println(res);
    }

}
