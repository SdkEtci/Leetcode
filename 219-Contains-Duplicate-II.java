import java.util.ArrayList;
import java.util.Hashtable;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer, ArrayList<Integer>> hash = new Hashtable<Integer, ArrayList<Integer>>();
		int min = Integer.MAX_VALUE;
		if (nums.length == 0)
			return false;

		for(int i = 0; i < nums.length; i++) {
			int key = nums[i];

			if (!hash.containsKey(key)) {
				ArrayList<Integer> arr = new ArrayList<Integer>();
				arr.add(i);
				hash.put(key, arr);
			}
			else {
				hash.get(key).add(i);
			}
		}

		for(int i = 0; i < nums.length; i++) {
			if(hash.get(nums[i]).size() == 1){
				continue;
			}
			for(int j= 0; j < hash.get(nums[i]).size() -1; j++) {
				int val = (hash.get(nums[i])).get(j+1) - (hash.get(nums[i])).get(j);
				if (val < min) {
					min = val;
				}
			}
			if (min <= k) {
				return true;
			}
		}

		return false;
    }
}