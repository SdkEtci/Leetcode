class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        int number = 1;
        
        if (s.length() != t.length())
        	return false;
        
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (hash.get(c) == null)
        		hash.put(c, number);
        	else {
        		hash.replace(c, hash.get(c) + 1);
        	}
        }
        
        for (int i = 0; i < t.length(); i++) {
        	char c = t.charAt(i);
        	if (hash.get(c) == null || hash.get(c) == 0)
        		return false;
        	else 
        		hash.replace(c, hash.get(c) - 1);
        }
        
        return true;
    }
}