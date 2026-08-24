// Last updated: 8/24/2026, 9:40:53 PM
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        int num = (int)(Math.random() * n) + 1;
        
        
        for (int i = 0; i < arr.length - 1; i += 2) {
            int fst = num++;
            int sec = fst * - 1;
            
            arr[i] = fst;
            arr[i+1] = sec;
            
            if(n%2 != 0){
                arr[arr.length - 1] = 0;
            }
    }
    return arr;
    }
}