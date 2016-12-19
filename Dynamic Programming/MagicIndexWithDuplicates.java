import java.io.*;
import java.util.*;
/*A magic index in an array defined to be an index such that A[i] = i. 
Given a sorted array, write a method to find a magic index in array. Array may contain duplicates
*/
class MagicIndexWithDuplicates {
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
  int leftIndex=Math.min(mid-1,arr[mid]);
  int left=findIndex(arr, start, leftIndex);
  if(left>=0)
    return left;
  int rightIndex=Math.max(mid+1,arr[mid]);
  int right= findIndex(arr,rightIndex, end);
  return right;
}

  public static void main(String[] args) {
    MagicIndexWithDuplicates s=new MagicIndexWithDuplicates();
    int[] arr={-10,-5,2,2,2,3,5,7,9,12,13};
    System.out.print("Magic Index:"+s.findIndex(arr));
  }
}
