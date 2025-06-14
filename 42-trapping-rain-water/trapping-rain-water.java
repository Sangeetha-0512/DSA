class Solution {
    public int trap(int[] height) {
    int[] max_left=new int[height.length];    
    int[] max_right=new int[height.length];  
    int max_l=0,max_r=0;  
    for(int i=0;i<height.length;i++){
        if(max_l<height[i]){
                max_left[i]=height[i];
                max_l=height[i];
            }else{
                max_left[i]=max_l;
            }
    }
        for(int j=height.length-1;j>=0;j--){
          if(max_r<height[j]){
                max_right[j]=height[j];
                max_r=height[j];
            }else{
                max_right[j]=max_r;
            }  
        }
     int water_in=0;
        for(int k=0;k<height.length;k++){
             water_in += Math.min(max_left[k], max_right[k]) - height[k];
        }
    return water_in;
    }
}