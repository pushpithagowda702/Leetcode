class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();

        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            List<String> list = new ArrayList<>();
            Integer hashCode = Arrays.toString(arr).hashCode();
            if(map.containsKey(hashCode)) {
                list = map.get(hashCode);
            }
            list.add(s);
            map.put(hashCode, list);
        }

        return new ArrayList<>(map.values());
    }
}