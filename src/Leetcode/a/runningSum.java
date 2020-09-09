/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

        Return the running sum of nums.
        Example 1:

        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        Example 2:

        Input: nums = [1,1,1,1,1]
        Output: [1,2,3,4,5]
        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
        Example 3:

        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]
 */


package Leetcode.a;

public class runningSum {
    int[] nums = {1,2,3,4};
    int[] result = new int[nums.length];;
    int sum = 0;
    int j = 0;

    public static void main(String[] args) {
        runningSum runningSum = new runningSum();
        runningSum.result();
    }

    void result(){
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + j; // 1;
            result[i] = sum; // 1
            j += nums[i]; // 1
        }
        System.out.println(result);
    }

}

/*
Нашел вот такое красивое решение на сайте:
class Solution {
public int[] runningSum(int[] nums) {
for(int i=1; i<nums.length; i++)
{
nums[i]=nums[i]+nums[i-1];
}
return nums;

}
}
Шедевр!
 */
