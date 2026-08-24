// Last updated: 8/24/2026, 9:40:25 PM
class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}