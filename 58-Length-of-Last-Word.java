class Solution {
    public int lengthOfLastWord(String s) {
        s.length();
        int length=0;
        for (int i= s.length()-1; i>=0 ;i--)
        {
        	if (((s.charAt(i)) >= 'a' && s.charAt(i) <= 'z') || 
        			(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
        	{
        		length++;
        	}
        	else 
        	{
        		if (length != 0)
        			break;
        	}
        }
        return length;
    }
}