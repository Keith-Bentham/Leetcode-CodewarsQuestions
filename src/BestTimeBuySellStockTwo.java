/**
 * Created by Keith Bentham
 */
public class BestTimeBuySellStockTwo {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxPro += (prices[i + 1] - prices[i]);
            }
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        BestTimeBuySellStockTwo btbss = new BestTimeBuySellStockTwo();
        System.out.println("Buy and sell when profitable: " + btbss.maxProfit(arr));
    }
}
