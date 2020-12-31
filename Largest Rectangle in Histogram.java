class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack();
        st.add(-1);
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++) {
            while(st.peek() != -1 && heights[st.peek()] >= heights[i]) {
                int h = heights[st.pop()];
                int w = i - st.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            st.add(i);
        }
        
        while(st.peek() != -1) {
            int h = heights[st.pop()];
            int w = heights.length - st.peek() - 1;
            maxArea = Math.max(maxArea, h * w);
        }
        
        return maxArea;
    }
}