// Print Anagrams Together



class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new LinkedHashMap<>();
        for(String word : arr) {
            char chars[] = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        for(List<String> grp : map.values()) {
            result.add(new ArrayList<>(grp));
        }
        return result;
    }
}
