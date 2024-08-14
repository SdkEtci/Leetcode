class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hash = new HashMap<Character, Character>();
        
        for (int i = 0; i < s.length(); i++) {
        	// Keys are unique
        	if (hash.get(s.charAt(i)) != null && hash.get(s.charAt(i)) != t.charAt(i)) 
        		return false;
        	// Values are unique
        	else if (hash.get(s.charAt(i)) == null && hash.containsValue(t.charAt(i))) 
        		return false;	
        	else
        		hash.put(s.charAt(i), t.charAt(i));
        }
        
        return true;
    }
}