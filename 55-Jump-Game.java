class Solution {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length -1; 
        
        // moving backwards
        for (int i= nums.length- 1; i>= 0; i--) {
        	if (i+ nums[i] >= lastIndex)
        		lastIndex= i;
        }
        
        // reach first index
        return lastIndex == 0; 
    }
}