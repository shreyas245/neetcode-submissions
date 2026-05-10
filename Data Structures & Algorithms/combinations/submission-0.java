class Solution {

    List<List<Integer>> result = new ArrayList<>();



    public List<List<Integer>> combine(int n, int k) {
     
            backtrack(1,n,k,new ArrayList<>());
            return result;

        }

    public void backtrack(int i,int n, int k, List<Integer> comb){

        if(i > n){
            if(comb.size() == k){
                result.add(new ArrayList<>(comb));
            }
            return;
        }

        comb.add(i);
        backtrack(i + 1, n, k, comb);
        comb.remove(comb.size() - 1);
        backtrack(i + 1,n,k,comb);

        

    }

}