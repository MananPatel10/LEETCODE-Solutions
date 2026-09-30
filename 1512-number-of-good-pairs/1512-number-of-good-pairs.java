class Solution {
    public int numIdenticalPairs(int[] nums) {
        //////BRUTE FORCE APPROACH///////
        // int count = 0;
        // for(int i=0 ; i<nums.length ;i++){
        //         for(int j=i+1; j<nums.length ; j++){
        //             if(nums[i] == nums[j]){
        //                 count++;
        //             }
        //         }
        // }
        // return count;

        /* 
        time complexity = O(n^2)
        space complexity = O(1)
        */


        //////OPTIMISED APPROACH////////
        int count = 0;
        int[] freq = new int[101];

        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }

        return count;
        /* 
        time complexity = O(n)
        space complexity = O(1)
        */
    }
}