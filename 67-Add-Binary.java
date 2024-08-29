class Solution {
    public String addBinary(String a, String b) {
        String resultReversed = "";
		String result = "";
		int remainder = 0;
		
		// Make them equal length
		if(a.length() != b.length()) {
			
			int lengthA = a.length();
			int lengthB = b.length();
			String s = "";
			
			if (lengthA > lengthB) {
				for(int i = 0; i < (lengthA - lengthB); i++) {
					s += "0";
				}
				b = s + b;
			}
			else {
				for(int i = 0; i < (lengthB - lengthA); i++) {
					s += "0";
				}
				a = s + a;
			}
		}
		
		for(int i = a.length() -1; i >= 0; i--) {
			if((a.charAt(i) == '1' && b.charAt(i) == '0') || 
					(a.charAt(i) == '0' && b.charAt(i) == '1')){
				if(remainder == 1) {
					resultReversed += "0";
				}
				else {
					resultReversed += "1";
				}
			}
			else if(a.charAt(i) == '0' && b.charAt(i) == '0') {
				if (remainder == 1) {
					resultReversed += "1";
					remainder = 0;
				}
				else {
					resultReversed += "0";
				}
			}
			else {
				if(remainder == 1)
				resultReversed += "1";
				else {
				resultReversed += "0";
				remainder = 1;
				}
			}
		}
		
		if(remainder == 1)
			resultReversed += "1";
		
		for(int i = resultReversed.length() -1 ; i >= 0; i--) {
			result += resultReversed.charAt(i);
		}
		
		return result;
    }
}