class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int num: nums)
        	arr.add(num);
        arr.sort(null);
        return arr.get(nums.length/2);
    }
}