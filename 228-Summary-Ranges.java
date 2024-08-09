class Solution {
    public List<String> summaryRanges(int[] nums) {
        // flag shows that it has end number
		int start, end = 0, flag = 0, temp, last;
		List<String>sList = new ArrayList<String>();
		
		if (nums.length == 0)
			return sList;
		
		if (nums.length == 1) {
			sList.add(nums[0] + "");
			return sList;
		}
		start = nums[0];
		last = nums[nums.length - 1];
		temp = start;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == temp + 1) {
				end = nums[i];
				temp = nums[i];
				flag = 1;
				
				if (nums[i] == last)
					sList.add(start + "->" + end);
			}
			else {
				if (flag == 0) {
					sList.add("" + start);
					start = nums[i];
					temp = start;

                    if (nums[i] == last)
						sList.add("" + start);
				}
				else {
					sList.add(start + "->" + end);
					start = nums[i];
					temp = start;
					flag = 0;
					
					if (nums[i] == last)
						sList.add("" + start);
				}
			}
		}
		
		return sList;
    }
}