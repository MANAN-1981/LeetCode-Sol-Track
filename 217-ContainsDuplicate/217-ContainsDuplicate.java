// Last updated: 8/24/2026, 9:42:26 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        } 
                   return false;
    }
}