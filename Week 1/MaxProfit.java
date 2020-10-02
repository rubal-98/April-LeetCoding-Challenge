class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;int first=0,second=-1;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[first]){
                first=i;
            }
            else if(prices[i]>prices[first]&&(i<prices.length-1&&prices[i]<prices[i+1])){
                continue;
            }else if(prices[i]>prices[first]&&(i==prices.length-1)){
                profit+=(prices[i]-prices[first]);
            }else if(prices[i]>prices[first]&&(i<prices.length-1&&prices[i]>prices[i+1])){
                profit+=(prices[i]-prices[first]);
                first=i+1;
            }
        }
        return profit;
    }
}