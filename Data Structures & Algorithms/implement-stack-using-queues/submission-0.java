class MyStack {
    Deque<Integer> queue;
    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.queue.addLast(x);
    }
    
    public int pop() {
        // if(queue.size() == 0) return null;
        return queue.removeLast();
    }
    
    public int top() {
        return queue.peekLast();
    }
    
    public boolean empty() {
        if(queue.size() == 0) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */