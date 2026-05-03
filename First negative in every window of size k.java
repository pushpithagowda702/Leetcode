class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int i = 0, j = k - 1;
        List<Integer> list = new ArrayList<>();
        int a = i;
        
        while(j < arr.length) {
            if(arr[a] < 0) {
                list.add(arr[a]);
                i++;
                j++;
                if(a < i) a++;
            } else if(a == j) {
                list.add(0);
                i++;
                j++;
                a++;
            } else {
                a++;
            }
        }
        return list;
    }
}