class Solution {
    public String largestNumber(int[] nums) {
        String sum = "";
        String[] arrString = new String[nums.length];
        
        for(int i = 0; i < arrString.length; i++) {
            arrString[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arrString, (a, b) -> (b+a).compareTo(a+b));

        if(arrString[0].equals("0")) return "0";

        for(int i = 0; i < arrString.length; i++) {
            sum += arrString[i];
        }
        return sum;
    }
}