class Solution {
    public int removeElement(int[] nums, int val) {
    int lastPointer = nums.length-1;
	int j=0;	
		for (int i=0; i<= lastPointer; i++)
		{  
			if (nums[i] == val)
			{
				int temp = nums[i];
				nums[i] = nums[lastPointer];
				nums[lastPointer] = temp;
				lastPointer--;
				i--;
                j++;
			}
		}
		return nums.length- j;
	}
}