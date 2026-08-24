// Last updated: 8/24/2026, 9:43:08 PM
class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
		int currentSum = nums[0];
		
		int maxSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
            
           currentSum = Math.max(currentSum+nums[i] , nums[i]);

			maxSum = Math.max(maxSum, currentSum);
		}
        return maxSum;
    }
}