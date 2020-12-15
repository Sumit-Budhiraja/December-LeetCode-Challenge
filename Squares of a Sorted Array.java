class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        
        for(int i = length - 1, r = i, l = 0; i >= 0; i--) {
            
            int leftVal = nums[l] * nums[l];
            int rightVal = nums[r] * nums[r];
            
            if(leftVal > rightVal) {
                answer[i] = leftVal;
                l++;
            } else {
                answer[i] = rightVal;
                r--;
            }
        }
        
        return answer;
    }
}