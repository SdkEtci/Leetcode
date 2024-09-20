class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        	return false;
        
        String s = x + "";
        int firstIndex = 0;
        int lastIndex = s.length() - 1;
        
        while(lastIndex > firstIndex) {
        	if(s.charAt(firstIndex) != s.charAt(lastIndex))
        		return false;
        	firstIndex++;
        	lastIndex--;
        }
        
        return true;
    }
}