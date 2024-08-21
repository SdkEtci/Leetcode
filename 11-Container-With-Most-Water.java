class Solution {
    public int maxArea(int[] height) {
        int startIndex = 0, lastIndex = height.length - 1;
        int area = 0;

        while (startIndex < lastIndex) {
            int temp = Math.min(height[startIndex], height[lastIndex]) *
                       (lastIndex - startIndex);
            area = Math.max(area, temp);

            if (height[startIndex] < height[lastIndex]) {
                startIndex++;
            } else {
                lastIndex--;
            }
        }
        return area;
    }
}