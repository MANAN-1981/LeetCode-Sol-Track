// Last updated: 8/24/2026, 9:42:33 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
       
        int half = (nums.length) / 2;

        return nums[half];
    }
}