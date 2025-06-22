class Solution {
    public int maxArea(int[] height) {
    int start=0;
    int end=height.length-1;
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    while(start<end){
        min=Math.min(height[start],height[end]);
        int value=end-start;
        max=Math.max(max,min*value);
        if(min==height[start]){
            start++;
        }else{
            end--;
        }
    } 
    return max;  
    }
}