class Solution {
    public int hammingWeight(int n) {
        int division = -1, remainder = 0;
		int count = 0;
		StringBuilder binary = new StringBuilder();
		
		while(division != 0) {
			remainder = n % 2;
			binary.append(remainder);
			division = n / 2;
			n = division;
		}
		
		// we dont need to reverse
		//binary.reverse();
		
		for(int i = 0; i < binary.length(); i++) {
			if(binary.charAt(i) == '1')
				count++;
		}
		
		return count;
    }
}