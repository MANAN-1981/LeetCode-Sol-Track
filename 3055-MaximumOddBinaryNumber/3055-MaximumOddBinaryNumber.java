// Last updated: 8/24/2026, 9:39:33 PM
class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        char arr[] = s.toCharArray();

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 2;

        while(l<r){
            if(arr[l] < arr[r]){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }

            l++;
            r--;
        }
        return new String(arr);
    }
}