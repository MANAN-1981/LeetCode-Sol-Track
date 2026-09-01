// Last updated: 9/1/2026, 11:14:51 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] < arr[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;

    }
}