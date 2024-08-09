class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	
        	if (c == '(' || c == '[' || c == '{') {
        		st.push(c);
        	}
            else if (st.isEmpty() == true) {
        		return false;
        	}
        	else if (c == ')') {
        		if (st.pop() != '(')
        			return false;
        	}
        	else if (c == ']') {
        		if (st.pop() != '[')
        			return false;
        	}
        	else {
        		if (st.pop() != '{')
        			return false;
        	}
        }

        if (st.isEmpty() != true)
        	return false;
        else 
        	return true;
    }
}