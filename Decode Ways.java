class Solution {
    // TC - O(n) = SC
    public int numDecodings(String s) {
        return helper(s, 0, new Integer[s.length()]);
    }
    
    private int helper(String s, int i, Integer[] dp) {
        if(i >= s.length())
            return 1;
        if(s.charAt(i) == '0')
            return 0;
        if(dp[i] != null)
            return dp[i];
        int ways = helper(s, i + 1, dp);
        if(i + 2 <= s.length() && Integer.parseInt(s.substring(i, i + 2)) <= 26)
            ways += helper(s, i + 2, dp);
        return dp[i] = ways;
    }
}
