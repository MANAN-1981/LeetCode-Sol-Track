// Last updated: 8/24/2026, 9:42:21 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<= i+k && j < nums.length; j++){
                if(nums[i] == nums[j]){
                    if(j-i <= k){
                    return true;
                    }
                }
            }
        }
        System.gc();
        return false;
    }
}