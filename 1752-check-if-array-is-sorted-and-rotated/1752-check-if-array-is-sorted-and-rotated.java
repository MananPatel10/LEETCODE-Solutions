class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Compare current element with the next element
            // Use modulo to wrap around from the last element to the first
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            
            // If there is more than one point where the non-decreasing order is violated
            if (count > 1) {
                return false;
            }
        }
        
        return true;
    }
}
