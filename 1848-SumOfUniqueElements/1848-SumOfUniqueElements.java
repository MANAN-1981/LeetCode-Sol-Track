// Last updated: 8/24/2026, 9:40:07 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        
        int sum = 0;
        
        
       for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count == 1){
                sum += nums[i];
            }
    }
             return sum;
}
}