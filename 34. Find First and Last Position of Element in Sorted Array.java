class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output = new int[] {-1, -1};
        binarySearch(nums, target, output, true);
        binarySearch(nums, target, output, false);
        return output;
    }

    private void binarySearch(int[] nums, int target, int[] output, boolean isFirst) {
        int start = 0, end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                if(isFirst) {
                    output[0] = mid;
                    end = mid - 1;
                } else {
                    output[1] = mid;
                    start = mid + 1;
                }
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}