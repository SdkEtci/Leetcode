class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
		int firstIndex = 0;
		int secondIndex = nums.length - 1;
		int[] result = {-1, -1};
		int num1 = 0, num2 = 0;
		
		// Creating sorted ArrayList 
        for (int number: nums) {
        	arr.add(number);
        }
        arr.sort(null);
        
        // Finding numbers
        while (secondIndex > firstIndex) {
        	int sum = arr.get(firstIndex) + arr.get(secondIndex);
        	if (target > sum)
        		firstIndex++;
        	else if (target < sum)
        		secondIndex--;
        	else {
        		num1 = arr.get(firstIndex);
        		num2 = arr.get(secondIndex);
        		break;
        	}
        }
        
        // Finding indexes in nums
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == num1 && result[0] == -1) {
        		result[0] = i;
        	}
        	if (nums[i] == num2) {
        		result[1] = i;
        	}
        }
        
        return result;
    }
}