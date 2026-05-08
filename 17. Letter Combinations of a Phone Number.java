class Solution {
    public List<String> letterCombinations(String digits) {
        String curr = "";
        List<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        combination(0, digits, curr, res, map);
        return res;
    }
    private void combination(int index, String digits, String curr, List<String> res, Map<Character, String> map) {
        if(curr.length() == digits.length()) {
            res.add(curr);
            return;
        }
        String letters = map.get(digits.charAt(index));

        for(int i=0; i<letters.length(); i++) {
            curr += letters.charAt(i);
            combination(index+1, digits,curr,res, map);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
}