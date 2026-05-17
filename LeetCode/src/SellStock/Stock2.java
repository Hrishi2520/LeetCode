class Stock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,8,4,9,5,7};
		System.out.println("Max Profit: "+maxProfit(nums));
	}
}