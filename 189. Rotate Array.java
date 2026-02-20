public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k==0) return;

        int i=nums.length - k - 1, j=nums.length - 1;
        int[] newArray = new int[k];

        for(int x=newArray.length-1; x>=0; x--) {
            newArray[x] = nums[j];
            nums[j] = nums[i];
            j--; i--;
        }

    }
}