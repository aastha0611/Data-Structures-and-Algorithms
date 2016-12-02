import java.io.*;
import java.util.*;
/*Implement Queue using Stacks
*/
public class QueuesUsingStacks {
    Stack<Integer> s=new Stack<Integer>();
    Stack<Integer> temp=new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
       while(!s.isEmpty()){
        temp.push(s.pop());
       }
      s.push(x);
       while(!temp.isEmpty()){
        s.push(temp.pop());
       }
        
    }

    // Removes the element from in front of queue.
    public int pop() {
        return s.pop();
    }

    // Get the front element.
    public int peek() {
        return s.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
       return (s.isEmpty())? true : false; 
    }

  public static void main(String[] args) {
        QueuesUsingStacks stack = new QueuesUsingStacks();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    
        System.out.println("Front element:"+ stack.peek()); 
        System.out.println("Remove front element:"+ stack.pop());
        System.out.println("Front element after 1 pop:"+ stack.peek());
        System.out.println("Remove front element:"+ stack.pop());
        System.out.println("Front element after 2 pops:"+ stack.peek());
                
  }
}