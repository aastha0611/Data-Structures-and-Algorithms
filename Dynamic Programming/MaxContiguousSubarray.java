/*Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
*/

public class MaxContiguousSubarray {
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        if(nums.length==1)
            return dp[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=nums.length-1;i++)
        {
            dp[i]=Math.max(nums[i], dp[i-1]+nums[i]);
        }
        for(int i=0;i<=dp.length-1;i++)
        {
            if(max<dp[i])
                max=dp[i];
        }
        return max;
    }
}