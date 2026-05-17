class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - n - 1, j = nums2.length - 1, counter = nums1.length - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[counter] = nums1[i];
                i--;
            } else {
                nums1[counter] = nums2[j];
                j--;
            }
                counter--;
        }

        while(counter >= 0) {
            if(i >= 0) {
                nums1[counter] = nums1[i];
                i--;
            } else if(j >= 0) {
                nums1[counter] = nums2[j];
                j--;
            }
            counter--;
        }
    }
}