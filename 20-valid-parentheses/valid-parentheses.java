class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character bracket : s.toCharArray()){
            if(bracket == '(') stack.push(')');
            else if(bracket == '{') stack.push('}');
            else if(bracket == '[') stack.push(']');
            else if(stack.isEmpty() || stack.pop() != bracket) return false;
        }
        return stack.isEmpty();
    }
}