class Solution {
    public int minimumDifference(int[] nums, int k) {
        int i = 0;
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int j=0;j<nums.length;j++){
           if(j - i + 1 > k){
            i++;
           } 
           if(j - i + 1 == k){
            res = Math.min(res,Math.abs(nums[j] - nums[i]));
           }
        }
        return res;
    }
}