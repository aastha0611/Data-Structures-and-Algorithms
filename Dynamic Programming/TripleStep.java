import java.io.*;
import java.util.*;
/*A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. 
Implement a method to count how many possible ways the child can run up the stairs.
*/

class TripleStep{
public int countWays(int n)
{
  int[] memo=new int[n+1];
  Arrays.fill(memo, -1);
  return countWays(memo, n);
}

public int countWays(int[] memo, int n)
{
  if(n==0)
    return 1;
  if(n<0)
    return 0;
  if(memo[n]>-1)
    return memo[n];
  memo[n]=countWays(memo, n-1)+countWays(memo, n-2)+countWays(memo, n-3);
  return memo[n];
}


  public static void main(String[] args) {
    TripleStep s=new TripleStep();
    System.out.print(s.countWays(4));
  }
}
