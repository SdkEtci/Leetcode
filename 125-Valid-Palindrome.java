class Solution {
    public boolean isPalindrome(String s) {
       String str = "";
		s = s.toLowerCase();
		
		// Creating new string with letters n numbers
		for (int i= 0; i< s.length(); i++)
        {
        	if ( (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || 
        			(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
        		str += s.charAt(i);
        	}
        }
		
		int mid = str.length()/2;
		
		for (int i=0, j= str.length()-1; mid > 0; i++, j--, mid--) {
			if (str.charAt(i) != str.charAt(j))
				return false;
		}
		
		return true;
    }
}