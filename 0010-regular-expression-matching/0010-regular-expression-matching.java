class Solution {
    public boolean isMatch(String s, String p) {
        
         int m = s.length();
        int n = p.length();
        
        // dp[i][j] represents if the first i characters in s match the first j characters in p
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // Empty string matches empty pattern
        
        // Initialize the first row
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2]; // '*' matches zero preceding element
            }
        }
        
        // Dynamic programming to fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match or '.' matches any character
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2]; // '*' matches zero preceding element
                    if (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') {
                        dp[i][j] |= dp[i - 1][j]; // '*' matches one or more preceding elements
                    }
                }
            }
        }
        
        return dp[m][n];
        
    }
}