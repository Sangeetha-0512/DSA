class Solution {
    public int maxProfit(int[] p) {
     int profit=0;
     int buy=p[0];  
     for(int i=1;i<p.length;i++){
        if(buy<p[i])
        {
            profit+=p[i]-buy;
        }
        buy=p[i];
     } 
     return profit;
    }
}