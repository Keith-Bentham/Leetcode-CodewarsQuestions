/**
 * Created by Keith Bentham
 * Say you have an array for which the ith element is
 * the price of a given stock on day i.
 * If you were only permitted to complete at most one
 * transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 */
public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > min) {
                res = Math.max(res, prices[i] - min);
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        BestTimeBuySellStock btbss = new BestTimeBuySellStock();
        System.out.println(btbss.maxProfit(arr));
    }
}
