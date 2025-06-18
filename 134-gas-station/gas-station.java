class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    if(gas.length !=cost.length) return -1;
    int total=0,sum=0,start=0;
    for(int i=0;i<gas.length;i++){
        int gain=gas[i]-cost[i];
            total+=gain;
            sum+=gain;
            if(sum<0){
                start=i+1;
                sum=0;
            }
    } 
    return total>=0?start:-1;   
    }
}