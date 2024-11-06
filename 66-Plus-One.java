class Solution {
    public int[] plusOne(int[] digits) {
        int add = 0;
		if (digits[digits.length - 1] != 9) {
			digits[digits.length - 1] = digits[digits.length - 1] + 1;
			return digits;
		}
		else {
			add = 1;
			
			for(int i = digits.length - 1; i >= 0; i--) {
				if(digits[i] != 9){
					digits[i] = digits[i] + 1;
					add = 0;
					break;
				}
				else{
					digits[i] = 0;
				}
			}
		}
		
		if (add == 0)
			return digits;
		else {
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			int i = 1;
			for (int d : digits) {
				result[i] = d;
				i++;
			}
			return result;
		}
    }
}