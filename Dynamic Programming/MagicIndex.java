import java.io.*;
import java.util.*;
/*A magic index in an array defined to be an index such that A[i] = i. 
Given a sorted array, write a method to find a magic index in array. Assume values are distinct.
*/
class MagicIndex {
public int findIndex(int[] arr)
{
  return findIndex(arr, 0, arr.length-1);
}

public int findIndex(int[] arr, int start, int end)
{
  if(start>end)
    return -1;
  int mid=(start+end)/2;
  if(arr[mid]==mid)
    return mid;
  if(arr[mid]<mid)
    return findIndex(arr, mid+1, arr.length-1);
  else
    return findIndex(arr, 0, mid-1);
}

  public static void main(String[] args) {
    MagicIndex s=new MagicIndex();
    int[] arr={-10,-5,-1,1,2,3,5,7,9,12,13};
    System.out.print("Magic Index:"+s.findIndex(arr));
  }
}
