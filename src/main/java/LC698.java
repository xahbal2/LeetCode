class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int a : nums){
            sum+= a;
        }
        if(sum%k !=0){
            return false;
        }

        int perSet = sum/k;


    }
}
