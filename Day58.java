// Longest substring with distinct characters


class Solution {
    public int longestUniqueSubstr(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int maxLength=0;
        int start = 0;
        for(int end=0; end<s.length(); end++){
            while(charSet.contains(s.charAt(end))){
                charSet.remove(s.charAt(start));
                start++;
            }
            charSet.add(s.charAt(end));
            maxLength=Math.max(maxLength, end - start +1);
        }
        return maxLength;
    }
}