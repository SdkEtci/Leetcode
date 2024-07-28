class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
		int index2 = numbers.length - 1;
		int result[] = {0, 0};
		
		while (index1 <= index2) {
			int sum = numbers[index1] + numbers[index2];
			
			if (sum < target) {
				index1++;
			}
			else if (sum > target) {
				index2--;
			}
			else {
				result[0] = index1 + 1;
				result[1] = index2 + 1;
				return result;
			}
		}
		
		return result;
		
		
		// Solution for O(n)
		/*
		 * ArrayList<Integer> arr = new ArrayList<Integer>();
		 * int index1 = 0, index2 =0;
		 * int[] result = {0,0};
		 * int value = 0; int minNumber = numbers[0];
		 * for (int i = 0; i < numbers.length; i++) {
		 *  if (target - numbers[i] >= minNumber)
		 * arr.add(target - numbers[i]); }
		 * 
		 * for (int i = 0; i < numbers.length; i++) { 
		 * if (arr.contains(numbers[i])) {
		 * index1 = i; value = target - numbers[i]; break; } }
		 * 
		 * for (int i = 0; i < numbers.length; i++) { 
		 * if (value == numbers[i]) { index2 = i; } }
		 * 
		 * result[0] = Math.min(index1, index2) + 1;
		 * result[1] = Math.max(index1, index2) + 1;
		 * 
		 * return result;
		 */
		
		/* Solution for O(n^2)
		 * int index1 = 0;
		 * int[] result = {0,0}; 
		 * for (int i = index1 + 1; i < numbers.length ; i++) { 
		 * if (target - numbers[index1] == numbers[i]) {
		 * result[0] = index1 + 1;
		 *  result[1] = i + 1;
		 *   return result;
		 *    } 
		 *    else { if (i == numbers.length - 1) 
		 *    { index1++; i = index1; } } }
		 * 
		 * return result;
		 */    
    }
}