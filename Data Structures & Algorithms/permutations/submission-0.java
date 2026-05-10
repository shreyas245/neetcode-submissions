class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> answer = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        generatePermutations(nums, 0 , sublist,answer);
        return answer;
    } 
    public static void generatePermutations(int[] nums, int index, List<Integer> sublist, List<List<Integer>> answer){

        if(index == nums.length){
            List<Integer> perm = new ArrayList<>();
            for(int n: nums) perm.add(n);
            answer.add(perm);
            return;
        }

        for(int i = index; i < nums.length; i++){
            swap(nums,index, i);
            generatePermutations(nums, index + 1, sublist, answer);
            swap(nums,index,i);  //backtracking
        }

        // backtrack


    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
