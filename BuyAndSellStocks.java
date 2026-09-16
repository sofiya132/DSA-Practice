import java.util.*;
class BuyAndSellStocks {
    public  static int maxProfit(int[] prices){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0; i<prices.length;i++){
            if(buyprice<prices[i]){
                 int profit = prices[i]-buyprice;
                 maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = prices[i];
                }
            }
            return maxprofit;
    }
    public static void main(String args[]){
      int n;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      int prices[] = new int[n];
      for(int i=0;i<n;i++){
        prices[i] = s.nextInt();
      }
        System.out.println(maxProfit(prices));
    }
}