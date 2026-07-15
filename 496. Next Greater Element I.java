class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int i=nums2.length - 1;
        while(i >= 0) {
            while(!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek() > nums2[i]) {
                map.put(nums2[i], stack.peek());
                stack.push(nums2[i]);
            }
            if(stack.isEmpty()) {
                stack.push(nums2[i]);
                map.put(nums2[i], -1);
            }
            i--;
        }
        int[] res = new int[nums1.length];
        for(int j=0; j<nums1.length; j++) {
            res[j] = map.getOrDefault(nums1[j], -1);
        }
        return res;
    }
}