class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        let product = [];
  for(let i=0;i<nums.length;i++){
    let ans = 1;
    for(let j = 0;j<nums.length;j++){
        if(i == j){
            continue;
        }
        ans = ans * nums[j];
     }
    product.push(ans)
}
return product;
    }
}
