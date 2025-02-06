package questionProblem;

// Find max profit in stocks

public class MaxStockProfit {
    public static void main(String[] args) {
        int[] stockPrices = {10, 19, 1, 30, 32};
        System.out.println(maxStockProfit(stockPrices));
    }

    public static int maxStockProfit(int[] prices){
        int maxProfit = 0;
        int minSoFar = prices[0];

        for(int price : prices){
            minSoFar = Math.min(minSoFar, price);
            int profit = price - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
//            System.out.println(maxProfit);
        }

//        for(int i=0; i<prices.length; i++){
//            minSoFar = Math.min(minSoFar, prices[i]);
//            int profit = prices[i] - minSoFar;
//            maxProfit = Math.max(maxProfit, profit);
//        }
        return maxProfit;
    }
}
