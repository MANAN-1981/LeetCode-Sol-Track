// Last updated: 8/24/2026, 10:01:49 PM
1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3
4        StringBuilder ans = new StringBuilder();
5
6        for (int i = 0; i < nums.length; i++) {
7
8            if (nums[i].charAt(i) == '0') {
9                ans.append('1');
10            } else {
11                ans.append('0');
12            }
13        }
14
15        return ans.toString();
16    }
17}