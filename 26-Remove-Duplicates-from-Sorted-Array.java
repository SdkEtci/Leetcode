class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1)
			return nums[0];
		
		int temp = nums[0];
		int total = nums.length;

        // Eliminating duplicates with changing them with 101	
        for (int i = 1; i < nums.length; i++) {
        	if (temp == nums[i]) {
        		nums[i] = 101; // inputs can not be more than 100
        		total--;
        	}
        	else {
        		temp = nums[i];
        	}
        }
        
        // Sorting
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] < 101) {
        		if (i != index) {
        			nums[index] = nums[i];
        			nums[i] = 101;
        		}
        		index++;
        	}
        }
        
        return total;
    }
}