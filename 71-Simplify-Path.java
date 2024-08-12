class Solution {
    public String simplifyPath(String path) {
        String s = "";
        Stack<String> stack = new Stack<String>();
        String[] arr = path.split("/");
        
        for (String str : arr) {
        	stack.add("/");
        	
        	if (str.equals("")) {
        		stack.pop();
        	}
        	
        	else if (str.equals(".")) {
        		stack.pop();
        	}
        	
        	else if (str.equals("..")) {
        		
        		for (int i = 0; i < 3; i++) {
        			if ( ! stack.isEmpty()) {
        				stack.pop();
        			}
        		}
        	}
        	
        	else {
        		stack.add(str);
        	}
        }
        
        if (stack.isEmpty()) {
        	s += "/";
        }
        
        for (int i = 0; i < stack.size(); i++)
        	s += stack.get(i);
        
        return s;
    }
}