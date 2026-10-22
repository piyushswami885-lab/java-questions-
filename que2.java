import java.util.ArrayList;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String x : strs) {
            char[] cArr = x.toCharArray();
            Arrays.sort(cArr);
            String key = new String(cArr);
            res.computeIfAbsent(key, k -> new ArrayList<>()).add(x);
        }

        return new ArrayList<>(res.values());
    }
}