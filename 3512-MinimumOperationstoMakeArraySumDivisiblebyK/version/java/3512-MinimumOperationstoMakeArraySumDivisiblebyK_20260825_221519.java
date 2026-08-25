// Last updated: 8/25/2026, 10:15:19 PM
1class Solution {
2    public int minOperations(int[] arr, int k) {
3
4        int l = 0;
5        int r = arr.length - 1;
6
7        int sum = 0;
8
9        while (l <= r) {
10
11            if (l == r) {
12                sum += arr[l];
13            } else {
14                sum += arr[l] + arr[r];
15            }
16            l++;
17            r--;
18        }
19
20        int counter = 0;
21
22        while (sum % k != 0) {
23            sum--;
24            counter++;
25        }
26
27        return counter;
28    }
29}