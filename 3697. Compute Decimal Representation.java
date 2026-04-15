class Solution {
    public int[] decimalRepresentation(int n) {
        // int size = (int) Math.log10(n) + 1;
        // if(size == 1) return new int[] {n};
        int i = 0;
        ArrayList<Integer> res = new ArrayList();
        while(n > 0) {
            int num = n % 10;
            n = n / 10;
            if(num > 0) res.add(0, num * (int) Math.pow(10, i));
            i++;
        }

        int[] sol = res.stream().mapToInt(Integer::intValue).toArray();
        return sol;
    }
}