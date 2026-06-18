class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("+") && !operations[i].equals("C") && !operations[i].equals("D")) {
                stack.push(Integer.parseInt(operations[i]));
            }
            if(operations[i].equals("D")){
                int number = stack.peek();
                stack.push(stack.peek() * 2);
            }

            if (operations[i].equals("+") && stack.size() >= 2) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a+b);

            }
            if(operations[i].equals("C")){
                stack.pop();
            }
        }

        for(int score: stack){
            result+=score;
        }
        return result;

    }
}