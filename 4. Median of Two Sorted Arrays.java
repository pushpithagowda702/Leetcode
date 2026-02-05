class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length + nums2.length];
        int i=0, j=0, k=0;

        while(k < mergedArr.length) {
            if((i < nums1.length && j < nums2.length && nums1[i] < nums2[j]) || (j >= nums2.length && i < nums1.length)) {
                mergedArr[k] = nums1[i];
                i++;
            } else if((i < nums1.length && j < nums2.length && nums1[i] > nums2[j]) || (j < nums2.length && i >= nums1.length)) {
                mergedArr[k] = nums2[j];
                j++;
            } else if (i < nums1.length && j < nums2.length) {
                mergedArr[k] = nums2[j];
                k++;
                mergedArr[k] = nums1[i];
                i++;
                j++;
            }
            System.out.println(Arrays.toString(mergedArr));
            k++;
        }

        if(mergedArr.length % 2 == 0) {
            System.out.println(Arrays.toString(mergedArr) + " " + mergedArr[mergedArr.length / 2] + " " + mergedArr[(mergedArr.length / 2) - 1]);
            return (double) (mergedArr[mergedArr.length / 2] + mergedArr[(mergedArr.length / 2) - 1]) / 2;
        }
        return mergedArr[mergedArr.length / 2];
    }
}