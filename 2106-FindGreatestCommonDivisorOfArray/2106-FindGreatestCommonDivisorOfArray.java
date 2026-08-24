// Last updated: 8/24/2026, 9:39:49 PM
class Solution {

 public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);

        return gcd(nums[0] , nums[nums.length-1]);
    }
}