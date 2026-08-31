// Last updated: 8/31/2026, 9:38:31 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        
4
5        int l = 0;
6        int r = arr.length - 1;
7
8        while (l < r) {
9            int mid = l + (r - l) / 2;
10
11            if (arr[mid] < arr[mid + 1]) {
12                l = mid + 1;
13            } else {
14                r = mid;
15            }
16        }
17
18        return l;
19
20    }
21}