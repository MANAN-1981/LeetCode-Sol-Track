// Last updated: 8/28/2026, 11:06:12 AM
1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        
4
5        int[] ans = new int[friends.length];
6        int index = 0;
7
8        for (int i : order) {
9            for (int j : friends) {
10                if (i == j) {
11                    ans[index++] = i;
12                    break;
13                }
14            }
15        }
16
17        return ans;
18    }
19}