// Last updated: 8/24/2026, 9:41:56 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> values = new HashSet<>();
		int n = nums.length;
		
        ArrayList<Integer> notPresent = new ArrayList<>();
		
        for(int i=0; i<n; i++){
		    values.add(nums[i]);
		}
		
		for(int i=1; i<=n; i++){
		    if(!values.contains(i)){
		        notPresent.add(i);
		    }
		}
        return notPresent;
    }
}