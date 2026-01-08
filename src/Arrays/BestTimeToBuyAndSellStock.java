package Arrays;

public class BestTimeToBuyAndSellStock {

    public static int CalProfit(int prices[]) {
        int buy_price = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++ ){
            if(prices[i] < buy_price) {
                buy_price = prices[i];
            }
            else{
                int currentProfit = prices[i] - buy_price;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(CalProfit(prices));
    }
}


// TC - O(n)
// SC - O(1)