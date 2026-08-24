// Last updated: 8/24/2026, 9:39:48 PM
class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;

        for (int i = nums.length - 1; i >= 0; i -= 3) {
            ans += nums[i];

            if (i - 1 >= 0) {
                ans += nums[i - 1];
            }
        }
        return ans;
    }
}