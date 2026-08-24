// Last updated: 8/24/2026, 9:40:58 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int n = arr.length;

		HashSet<Integer> filt = new HashSet<>();
		ArrayList<Integer> rank = new ArrayList<>();
		int price[] = new int[arr.length];

		for(int i = 0; i < n; i++) {
			filt.add(arr[i]);
		}

		for(int num : filt) {
			rank.add(num);
		}

		Collections.sort(rank);

		for(int i = 0; i < arr.length; i++) {
			 price[i] = Collections.binarySearch(rank, arr[i]) + 1;
		}

        return price;
    }
}