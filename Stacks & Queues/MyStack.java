/** Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
**/

class MyStack {
    // Push element x onto stack.
    Deque<Integer> dq=new ArrayDeque<Integer>();
    public void push(int x) {
        dq.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        dq.removeLast();
    }

    // Get the top element.
    public int top() {
        int x=dq.removeLast();
        dq.offer(x);
        return x;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return dq.isEmpty();
    }
}