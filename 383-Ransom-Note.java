class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> arr = new ArrayList<Character>();
        
        if (magazine.length() < ransomNote.length())
        	return false;
        for (int i = 0; i < magazine.length(); i++) {
        	arr.add(magazine.charAt(i));
        }
        for (int i = 0; i < ransomNote.length(); i++) {
        	if (arr.contains(ransomNote.charAt(i))) {
        		int index = arr.indexOf(ransomNote.charAt(i));
        		arr.remove(index);
        	}
        	else 
        		return false;
        }
        return true;
    }
}