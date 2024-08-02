class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, String> hash = new HashMap<String, String>();
        String[] arr = s.split(" ");
        
        // if length is different, result false
        if (arr.length != pattern.length())
        	return false;
        
        for (int i = 0; i < pattern.length(); i++) {
        	String hKey = pattern.charAt(i) + "";
        	// Checking keys
        	if (hash.containsKey(hKey) && ! hash.get(hKey).equals(arr[i]))
        		return false;
        	hash.put(hKey, arr[i]);
        }
        
        // Checking duplicate value by creating new ArrayList
        ArrayList<String> aList = new ArrayList<String>();
        for (String h : hash.keySet()) {
        	String str = hash.get(h);
        	if (aList.contains(str))
        		return false;
        	else 
        		aList.add(str);
        }
        
        return true;
    }
}