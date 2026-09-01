// Last updated: 9/1/2026, 11:14:06 AM
class Solution {
    public int minOperations(int[] arr, int k) {

        int l = 0;
        int r = arr.length - 1;

        int sum = 0;

        while (l <= r) {

            if (l == r) {
                sum += arr[l];
            } else {
                sum += arr[l] + arr[r];
            }
            l++;
            r--;
        }

        int counter = 0;

        while (sum % k != 0) {
            sum--;
            counter++;
        }

        return counter;
    }
}