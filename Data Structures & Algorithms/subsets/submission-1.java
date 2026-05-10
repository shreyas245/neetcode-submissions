class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       
       List<List<Integer>> result = new ArrayList<>();

       dfs(result, new ArrayList<>(), nums, 0);

        return result;
    }
    public void dfs(List<List<Integer>> resultSet,List<Integer> tempSet, int[] nums,int index){
        resultSet.add(new ArrayList<>(tempSet));
        for(int i = index; i < nums.length; i++){
            // case of including 
            tempSet.add(nums[i]);

            dfs(resultSet,tempSet,nums, i + 1);

            // case of not including the subset
            tempSet.remove(tempSet.size() - 1);

        }
    }
}
