// Last updated: 8/24/2026, 9:40:22 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        int arr[] = new int[101];

        for(int i=0; i<nums.length; i++){
            count += arr[nums[i]];
            arr[nums[i]]++;
        }
        return count;
    }
}