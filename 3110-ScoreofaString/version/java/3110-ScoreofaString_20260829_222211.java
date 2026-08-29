// Last updated: 8/29/2026, 10:22:11 PM
1class Solution {
2    public int scoreOfString(String s) {
3        
4         int out = 0;
5
6        for (int i = 1; i < s.length(); i++) {
7            out += Math.abs(s.charAt(i) - s.charAt(i - 1));
8        }
9
10        return out;
11    }
12}