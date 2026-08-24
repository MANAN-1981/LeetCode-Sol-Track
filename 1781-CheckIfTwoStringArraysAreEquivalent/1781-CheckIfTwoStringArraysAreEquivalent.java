// Last updated: 8/24/2026, 9:40:17 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
       

        for (int i = 0; i < word1.length; i++) {
            a.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            b.append(word2[i]);
            
        }

        return a.toString().equals(b.toString());

    }
}