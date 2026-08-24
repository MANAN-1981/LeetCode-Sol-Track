// Last updated: 8/24/2026, 9:39:51 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int newNums[] = new int[nums.length * 2];
        
        int j=0;       
        
        for(int i=0; i<newNums.length; i++){
            if(j == nums.length){
                j = 0;
                i--;
            }else{
                newNums[i] = nums[j];
                j++;
            }
        }
        return newNums;
    }
}