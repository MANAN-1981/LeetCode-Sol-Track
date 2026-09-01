// Last updated: 9/1/2026, 11:14:12 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
         List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                if (c == x) {
                    ans.add(i);
                    break;
                }
            }
        }

        return ans;
        
    }
}