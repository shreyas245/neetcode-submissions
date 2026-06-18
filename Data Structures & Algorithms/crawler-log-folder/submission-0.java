class Solution {
    public int minOperations(String[] logs) {
          Stack<String> stack = new Stack();

        for (int i = 0; i < logs.length; i++) {

            if (!logs[i].equals("../") && !logs[i].equals("./")) {
                stack.push(logs[i]);
                System.out.println("Pushed element: " + logs[i]);

            }
            if(logs[i].equals("../")) {
                if(!stack.isEmpty()){
                System.out.println("Pop element: " + logs[i]);
                stack.pop();
                }
                
            }
        }
        return stack.size();
    }
}