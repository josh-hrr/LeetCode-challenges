class Solution {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];

        for(int i = 1; i<nums.length; i++){
            results[i] = nums[i] + results[i - 1];
        } 
        return results;
    }
}

/* 

  Test Case:

  Input: nums = [1,2,3,4]
  Output: [1,3,6,10]
  Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]. 

*/
