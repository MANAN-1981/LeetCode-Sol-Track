// Last updated: 8/24/2026, 9:41:55 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
		int live = 0;
		
			for (int i=0; i<nums.length; i++){
		    
		    if(nums[i] == 1){
		        count++;
		    }else{
                count = 0;
		    }
		    if(count > live){
		        live = count;
		    }
		} 
		return live;
    }
}