class StockChallenge {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;
        int buy = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            } else {
                currentProfit = prices[i] - buy;
                maxProfit = currentProfit > maxProfit ? currentProfit : maxProfit;
            }
        }
        return maxProfit;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,8,4,9,5,7};
		System.out.println("Max Profit: "+maxProfit(nums));
	}
}