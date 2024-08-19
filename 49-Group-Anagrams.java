class Solution {
    public static boolean isAnagram(String s, String t) {
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

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
		int[] arr = new int[strs.length]; // To check if string is added to the result array
		int index = 0;
		
		for (int i = 0; i < strs.length; i++) {
			if (arr[i] == -1)
				continue;
			else {
				List<String> sArr = new ArrayList<String>();
				sArr.add(strs[i]);

				for (int j = i + 1; j < strs.length; j++) {
					if (arr[j] != -1 && isAnagram(strs[i], strs[j])) {
						sArr.add(strs[j]);
						arr[j] = -1;
					}
				}
				result.add(index, sArr);
				index++;
			}
		}
		return result;
	}
}
