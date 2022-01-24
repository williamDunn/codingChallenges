// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// Time complexity: O(n^2) - naive approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
