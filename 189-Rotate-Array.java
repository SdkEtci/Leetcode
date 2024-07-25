class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
		k = k %nums.length;
		for (int i= 0; i< nums.length; i++) {
			if (nums.length == 1)
				arr[i]= nums[i];
			else if (i+ k > nums.length- 1)
				arr[i+ k- nums.length] = nums[i];
			else 
				arr[i+ k] = nums[i];
		}
		
		for (int i= 0; i< nums.length; i++) {
			nums[i] = arr[i];
		}
		
		// Solution O(n^2)
		/*
		for (int j=0; j< k; j++) {
			arr[0] = nums[nums.length -1];

			for (int i= 0; i <nums.length-1; i++) { // first element is initialized
				arr[i+1] = nums[i];
			}
			
			for (int i= 0; i< nums.length; i++) {
				nums[i] = arr[i];
			}
		*/
    }
}