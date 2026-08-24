// Last updated: 8/24/2026, 9:42:36 PM
class Solution {
    public int singleNumber(int[] nums) {
        
       int count = nums[0];

       for(int i=1; i<nums.length; i++){
        count = count ^ nums[i];
       }
       return count;
    }
}