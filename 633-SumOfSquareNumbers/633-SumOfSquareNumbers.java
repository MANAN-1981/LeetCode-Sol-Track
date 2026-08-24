// Last updated: 8/24/2026, 9:41:46 PM
class Solution {
    public boolean judgeSquareSum(int c) {

        long l = 0;
        long r =(long)Math.sqrt(c); 

        while(l<=r)
        {
            long sum = l*l + r*r;

            if(sum == c)
            {
                return true;
            }

            else if(sum >c)
            {
                r--;
            }

            else
            {
                l++;
            }

        }   
    
    return false;

    }
}