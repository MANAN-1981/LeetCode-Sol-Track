// Last updated: 8/24/2026, 9:52:01 PM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3
4        int count = 0;
5
6        for (int k = 0; k < nums.length; k++) {
7
8            while (nums[k] != 0) {
9
10                int val = nums[k] % 10;
11
12                if (val == digit) {
13                    count++;
14                }
15
16                nums[k] = nums[k] / 10;
17            }
18        }
19
20        return count;
21
22    }
23}