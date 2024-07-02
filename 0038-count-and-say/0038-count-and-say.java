class Solution {
    public String countAndSay(int n) {
           if (n == 1) {
            return "1";
        }
        
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < prev.length(); i++) {
            char currentChar = prev.charAt(i);
            
            // Count consecutive identical characters
            while (i + 1 < prev.length() && prev.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            
            // Append count and character to result likely
            result.append(count).append(currentChar);
            
            // Reset count for next character
            count = 1;
        }
        
        return result.toString();
    }
}