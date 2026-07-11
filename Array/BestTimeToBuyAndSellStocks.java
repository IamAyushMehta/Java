public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        // int prices[] = {7, 6, 4, 3, 1};

        System.out.println(bestTimeToBuyAndSellStocks(prices));
    }

    public static int bestTimeToBuyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE, maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

}
