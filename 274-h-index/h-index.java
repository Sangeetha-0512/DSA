class Solution {
    public int hIndex(int[] citations) {
    Integer[] temp = Arrays.stream(citations).boxed().toArray(Integer[]::new);
    Arrays.sort(temp, Collections.reverseOrder()); 
    // if(temp.length==1){
    //     if(temp[0]>=1){
    //         return 1;
    //     }
    // } 
    for(int i=0;i<temp.length;i++){
        if(temp[i]<i+1){
            return i;
        }
    } 

    return temp.length;
    }
}