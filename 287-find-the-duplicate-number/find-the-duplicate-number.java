class Solution {
    public int findDuplicate(int[] nums) {
    HashSet<Integer>seen=new HashSet<>();
    for(int arr:nums){
        if(seen.contains(arr)){
            return arr;
        }
        seen.add(arr);
    }
    
    return 0;
    }
}