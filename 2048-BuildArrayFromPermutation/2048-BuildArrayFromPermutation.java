// Last updated: 8/24/2026, 9:39:55 PM
class Solution {
    public int[] buildArray(int[] nums) {

        int n = nums.length;

        int target[] = new int[n];

        for (int i = 0; i < n; i++) {
            target[i] = nums[nums[i]];
        }

        return target;
    }
}