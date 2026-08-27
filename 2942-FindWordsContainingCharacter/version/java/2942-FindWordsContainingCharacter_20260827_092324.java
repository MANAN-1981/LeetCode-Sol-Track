// Last updated: 8/27/2026, 9:23:24 AM
1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        
4         List<Integer> ans = new ArrayList<>();
5
6        for (int i = 0; i < words.length; i++) {
7            for (char c : words[i].toCharArray()) {
8                if (c == x) {
9                    ans.add(i);
10                    break;
11                }
12            }
13        }
14
15        return ans;
16        
17    }
18}