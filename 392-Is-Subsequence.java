public class Solution {
	public boolean isSubsequence(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
        	int val = t.indexOf(s.charAt(i));
        	
        	if (val == -1)
        		return false;
        	else
        		t = t.substring(val+1);
        }
        return true;
    }
}
