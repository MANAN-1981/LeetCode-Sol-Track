// Last updated: 8/26/2026, 10:21:30 PM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        
4        int arr[] = new int[10];
5
6        while (n != 0) {
7            int temp = n % 10;
8            arr[temp]++;
9            n = n / 10;
10        }
11
12        int l = 0;
13        int r = arr.length - 1;
14
15        int sum = 0;
16
17        while (l <= r) {
18
19            if (l == r) {
20                if (arr[l] > 0) {
21                    sum += arr[l] * l;
22                }
23            } else {
24                if (arr[l] > 0) {
25                    sum += arr[l] * l;
26                }
27
28                if (arr[r] > 0) {
29                    sum += arr[r] * r;
30                }
31            }
32
33            l++;
34            r--;
35        }
36
37        return sum;
38    }
39}