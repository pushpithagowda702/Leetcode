class Solution {
    public int[] dailyTemperatures(int[] tem) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = tem.length - 1;
        int[] sol = new int[n+1];
        stack.push(n);
        sol[n] = 0;
        for(int i=n; i>=0; i--) {
            while(!stack.isEmpty() && tem[i] >= tem[stack.peek()]) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                sol[i] = stack.peek() - i;
            } else {
                sol[i] = 0; 
            }
            stack.push(i);
        }
        return sol;
    }
}