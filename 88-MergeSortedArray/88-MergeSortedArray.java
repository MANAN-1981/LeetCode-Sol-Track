// Last updated: 8/24/2026, 9:42:49 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        for(int i=m; i<nums1.length; i++){
            if(nums1[i] == 0){
                nums1[i] = nums2[n-1];
                n--;
            }
        }
        Arrays.sort(nums1);
    }
}