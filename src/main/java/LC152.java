class Solution {
    public int maxProduct(int[] nums) {
        int posMin = nums[0];
        int posMax = nums[0];
        int max =nums[0];
        for(int i = 1; i<nums.length; i++) {
            int cur = nums[i];
            int tempMax = Math.max(cur, Math.max(cur * posMax, cur * posMin));
            posMin = Math.min(cur, Math.min(cur * posMax, cur * posMin));
            posMax = tempMax;
            max = Math.max(max, posMax);
        }

        return max;
    }
}