
public class MaxProfit {

    public static int maxProfit(int[] prices) {
    	
    	int profit = 0;
    	int lowestPrice = prices[0];
    	int i = 0;
    	while (i < prices.length) {
    		if (prices[i] < lowestPrice) {
    			lowestPrice = prices[i];
    			System.out.println("lowest price: " + lowestPrice);
    			i++;
    		}
    		int j = prices.length - 1;    		
    		while (j > i) {

    			if (prices[j] - lowestPrice > profit) {
    				profit = prices[j] - lowestPrice;
    			}
    			j--;
    			
    		}
    		i++;
    	}
    	return profit;	
    }
    
    
    public static void main(String args[]) {
    	int[] test = { 7, 1, 5, 3, 6, 4 };
    	System.out.println("The most profit is: " + maxProfit(test));
    }
	
}
