class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1)
			return 1;
		
		int temp = nums[0];
		int total = nums.length;
        int count = 1;	
        
        for (int i = 1; i < nums.length; i++) {
        	if (temp == nums[i]) {
        		if (count == 1) {
        			count ++;
        		}
        		else {
        		nums[i] = 10001; // inputs can not be more than 10000
        		total--;
        		}
        	}
        	else {
        		temp = nums[i];
        		count = 1;
        	}
        }
        
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] < 10001) {
        		if (i != index) {
        			nums[index] = nums[i];
        			nums[i] = 10001;
        		}
        		index++;
        	}
        }
        
        return total;
    }
}