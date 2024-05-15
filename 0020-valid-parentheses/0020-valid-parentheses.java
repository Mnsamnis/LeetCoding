class Solution {
    public boolean isValid(String s) {
           char[] stack = new char[s.length()];
        int top = -1; // Pointer to the top of the stack
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch; // Push open bracket onto the stack
            } else {
                if (top == -1) {
                    return false; // No corresponding open bracket
                }
                char openBracket = stack[top--];
                if ((ch == ')' && openBracket != '(') ||
                    (ch == '}' && openBracket != '{') ||
                    (ch == ']' && openBracket != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        return top == -1;
    }
}