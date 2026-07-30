class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<asteroids.length; i++) {
            if(asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                if(stack.isEmpty()) {
                    stack.push(asteroids[i]);
                    continue;
                }
                int curr = Math.abs(asteroids[i]);
                boolean destroyed = false;
                while(!stack.isEmpty() && stack.peek() > 0) {
                    if(stack.peek() == curr) {
                        stack.pop();
                        destroyed = true;
                        break;
                    }
                    if(stack.peek() < curr) {
                        stack.pop();
                    } else {
                        destroyed = true;
                        break;
                    }
                }
                if(!destroyed) stack.push(asteroids[i]);
            }
        }
        int[] res = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}