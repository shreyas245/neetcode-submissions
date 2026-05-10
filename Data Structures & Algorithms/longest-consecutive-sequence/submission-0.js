class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    
    longestConsecutive(nums) {
       let longest = 0;
    let s = new Set(nums);

    console.log(s)

    for (let i = 0; i < nums.length; i++) {
        if (!s.has(nums[i] - 1)) {
            let length = 1;
            while (s.has(nums[i] + length)) {
                length++;
            }
            longest = Math.max(length, longest)
        }
    }
    return longest;    }
}
