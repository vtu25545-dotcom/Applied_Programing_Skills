class SellStocks {
    public int maxProfit(int[] prices) {
        int left = 0; 
        int right = 1;
        int maxLucro = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int lucroAtual = prices[right] - prices[left];
                maxLucro = Math.max(maxLucro, lucroAtual);
            } else {
                left = right;
            }
            right++;
        }
        return maxLucro;
    }
}