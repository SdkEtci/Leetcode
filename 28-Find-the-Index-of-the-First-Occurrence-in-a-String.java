class Solution {
    public int strStr(String haystack, String needle) {
        int result= -1;
        int index=0;
        for (int i= 0; i< haystack.length() && index< needle.length(); i++)
        {
        	if (haystack.charAt(i) == needle.charAt(index))
        	{
        		index++;
        		result= i - needle.length() +1;
        	}
        	
        	else {
                i -= index;
        		index= 0;
        		result= -1;
        	}
        }
        if (index != needle.length())
        	result = -1;
        return result;
    }
}