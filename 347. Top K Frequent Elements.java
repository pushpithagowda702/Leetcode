class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer item1, Integer item2) {
                return item2 - item1;
            }
        });

        for(int key : map.keySet()) {
            queue.offer(key);
            if(queue.size() > k) {
                queue.poll();
            }
        }

        int[] result = new int[k];

        while(k != 0) {
            result[--k] = queue.poll();
        }
        return result;
    }
}