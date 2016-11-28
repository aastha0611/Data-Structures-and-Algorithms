import java.util.*;

//Maximum of all subarrays of size k in O(n) (Sliding Window Maximum)
public class MaxSlidingWindow {
  public int[] findAllMax(int[] a, int k){
    Deque<Integer> q=new LinkedList<Integer>();
    int n=a.length;
    int[] res=new int[n-k+1];
    for(int i=0;i<n;i++){
        int index=i-k+1;
      while(!q.isEmpty() && q.peek()<index)
        q.poll();
      while(!q.isEmpty() && a[q.peek()]<a[i])
        q.poll();
      q.offer(i);
      if(index>=0)
        res[index]=a[q.peek()];   
    }
    return res;
  }
  
  public static void main (String[] args){
    MaxSlidingWindow s=new MaxSlidingWindow();
    int[] a={1, 2, 3, 1, 4, 5, 2, 3, 6};
    int[] result=s.findAllMax(a,3);
    for(Integer i:result)
      System.out.print(i+" ");
        
  }
}
