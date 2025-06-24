class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int j = 0; j < n; j++) {
            if (nums[j] == key) {
                int start = Math.max(0, j - k);
                int end = Math.min(n - 1, j + k);
                for (int i = start; i <= end; i++) {
                    set.add(i);
                }
            }
        }

        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result); 
        return result;
    }
}
