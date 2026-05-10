class Solution {
    public List<String> generateParenthesis(int n) {
        // Only add open paranthesis if open < n 
        // only add a closing paranthesis if closed < open
        // valid IIF open == closed == n 
        
        StringBuilder stack = new StringBuilder();
        List<String> res = new ArrayList<>();
        backtrack(0,0,n,res,stack);
        return res;
    }

    private void backtrack(int openN, int closedN, int n,
     List<String> res, StringBuilder stack){

        if(openN == closedN && openN == n){
            res.add(stack.toString());
            return;
        }
        if(openN < n){
            stack.append('(');
            backtrack(openN + 1, closedN, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        if(closedN < openN){
            stack.append(')');
            backtrack(openN,closedN + 1,n,res,stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }


}