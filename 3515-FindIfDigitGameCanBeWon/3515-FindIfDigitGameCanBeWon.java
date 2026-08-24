// Last updated: 8/24/2026, 9:39:20 PM
class Solution {
    public boolean canAliceWin(int[] arr) {

        int n = arr.length;

        int SiSum = 0;
        int DoSum = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] < 10) {
                SiSum += arr[i];
            }
            if (arr[i] >= 10) {
                DoSum += arr[i];
            }
        }
        return SiSum != DoSum;
    }
}