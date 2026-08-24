// Last updated: 8/24/2026, 9:41:16 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        
        String str = s + s;

        if(s.length() != goal.length()){
            return false;
        }

        if(str.contains(goal)){
            return true;
        }

        return false;
    
    } 
}