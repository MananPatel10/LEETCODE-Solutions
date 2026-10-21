class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // List<Integer> arr = new ArrayList<>();

        // for(int i =0;i <nums.length;i++){
        //     arr.add(index[i],nums[i]);
        // }
        // int target[] = new int[arr.size()];
        // for(int i=0 ; i<nums.length;i++){
        //     target[i]= arr.get(i);
        // }
        // return target;



        //Brute force;
        int n = nums.length;
        int[] target = new int[n];
        int size = 0;

        for(int i=0 ; i<n;i++){
            //shift element to the right
            for(int j= size; j>index[i];j--){
                target[j]=target[j-1];
            }

        //inserting the current value
        target[index[i]] = nums[i];
        size++;
        }
        return target;
    }
}