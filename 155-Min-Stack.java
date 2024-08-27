class MinStack {

    private ArrayList<Integer> arr = new ArrayList<Integer>();
	private ArrayList<Integer> copy = new ArrayList<Integer>();
	
    public MinStack() {
    }
    
    public void push(int val) {
        arr.add(val);
    }
    
    public void pop() {
        arr.remove(arr.size() - 1);
    }
    
	public int top() {
        return arr.get(arr.size() - 1);
    }
    
    public int getMin() {
        copy.addAll(arr);
    	copy.sort(null);
		int min = copy.get(0);
		copy.clear();
    	return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */