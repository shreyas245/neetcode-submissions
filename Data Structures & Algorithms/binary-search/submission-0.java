class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        while(left <= right){
            if(nums[mid] > target){
                right = mid - 1;
                mid = (left + right) / 2;
            }else{
                left = mid + 1;
                mid = (left + right) / 2;
            }
            if(nums[mid] == target){
                return mid;
            }
        }
        return -1;

    }
}
