class Solution {
    private int index = 0;


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, new ArrayList<>(), nums, 0);

        return result;
    }

    public void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start ){
      
        if(resultSets.contains(tempSet)) return;
      
        resultSets.add(new ArrayList<>(tempSet));

        for(int i = start; i < nums.length; i++ ){

            //case of including the number
            tempSet.add(nums[i]);


            //Backtrack the new subset
            backtrack(resultSets, tempSet, nums, i + 1);

           //case of not including the number
           tempSet.remove(tempSet.size() - 1); 

        }   
    }


}