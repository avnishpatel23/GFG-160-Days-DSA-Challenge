// Day 16 - Anagram Check


class Solution {

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] res = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            res[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            res[s2.charAt(i) - 'a']--;
        }

        for (int count : res) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
