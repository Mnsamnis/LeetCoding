class Solution {
    public int romanToInt(String s) {
         // Create a hashmap to store the integer values of Roman symbols
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int total = 0;
        int prevValue = 0; // Store the value of the previous symbol to handle subtraction cases
        
        // Iterate through the string from left to right
        for (int i = 0; i < s.length(); i++) {
            int value = romanValues.get(s.charAt(i));
            
            // If the current value is greater than the previous, subtract the previous value
            if (value > prevValue) {
                total += value - 2 * prevValue; // Subtract twice the previous value
            } else {
                total += value;
            }
            
            prevValue = value;
        }
        
        return total;
    }
}