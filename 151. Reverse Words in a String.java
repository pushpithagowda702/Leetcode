class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        for(int i=arr.length - 1; i>=0; i--) {
            // if(arr[i] != " ") {
                res.append(arr[i].strip());
                if(i != 0) res.append(" ");
            // }
        }
        return res.toString();
    }
}