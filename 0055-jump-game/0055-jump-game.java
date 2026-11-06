class Solution {

    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];

        Arrays.fill(dp, -1);

        return solve(nums, 0, dp);
    }

    public boolean solve(int[] nums, int index, int[] dp) {

        // Reached last index
        if (index >= nums.length - 1) {
            return true;
        }

        // Already calculated
        if (dp[index] != -1) {
            return dp[index] == 1;
        }

        // Try maximum jump first
        for (int jump = nums[index]; jump >= 1; jump--) {

            if (solve(nums, index + jump, dp)) {
                dp[index] = 1;
                return true;
            }
        }

        dp[index] = 0;
        return false;
    }
}