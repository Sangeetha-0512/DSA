class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i]; 
            pairs[i][1] = i;  
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < k; i++) {
            freq.put(pairs[i][0], freq.getOrDefault(pairs[i][0], 0) + 1);
        }
        int[] result = new int[k];
        int index = 0;

        for (int num : nums) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                result[index++] = num;
                freq.put(num, freq.get(num) - 1);
                if (index == k) break;
            }
        }

        return result;
    }
}
