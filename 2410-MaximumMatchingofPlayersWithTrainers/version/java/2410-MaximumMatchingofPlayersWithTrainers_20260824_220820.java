// Last updated: 8/24/2026, 10:08:20 PM
1class Solution {
2    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
3        
4         Arrays.sort(players);
5        Arrays.sort(trainers);
6
7        int i = 0;
8        int j = 0;
9        int count = 0;
10
11        while (i < players.length && j < trainers.length) {
12
13            if (players[i] <= trainers[j]) {
14                count++;
15                i++;
16                j++;
17            } else {
18                j++;
19            }
20        }
21
22        return count;
23    }
24}