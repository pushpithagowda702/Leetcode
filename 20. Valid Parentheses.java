class Solution {
    public boolean isValid(String s) {
        // if(s.length() == 1) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(stack.isEmpty() || stack.pop() != map.get(s.charAt(i))) return false;
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}