class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;


    /** Initialize your data structure here. */
    public MyQueue() {
        stack1=new Stack();
        stack2=new Stack();

    }
    
    /** Push element x to the back of queue. */O(1) always
    public void push(int x) {
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */ O(n) WC
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int temp=stack2.pop();
         while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
       return temp;
    }
    
    /** Get the front element. */O(n) WC
    public int peek() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int temp=stack2.peek();
         while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty())return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
