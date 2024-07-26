class Solution {
    public int romanToInt(String s) {
        String letters = "IVXLCDM";
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        int total = 0;
        
        for (int i=0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	char next = 0;
        	if (i+1 < s.length()) {
        		next = s.charAt(i+1);
        	}
        	if(c == 'I'  && next == 'V') {
        		total += 4;
        		i++;
        	}
        	else if (c == 'I'  && next == 'X') {
        		total += 9;
        		i++;
        	}
        	else if ((c == 'X'  && next == 'L')) {
        		total += 40;
        		i++;
        	}
        	else if ((c == 'X'  && next == 'C')) {
        		total += 90;
        		i++;
        	}
        	else if ((c == 'C'  && next == 'D')) {
        		total += 400;
        		i++;
        	}
        	else if ((c == 'C'  && next == 'M')) {
        		total += 900;
        		i++;
        	}
        	else {
        		total += values[letters.indexOf(c)];
        	}
        	
        }
		return total;
    }
}