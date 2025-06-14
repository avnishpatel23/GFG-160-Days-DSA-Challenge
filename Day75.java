// Permutations of a String



class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort (chars);
        boolean[] used = new boolean[chars.length];
        backtrack(chars, used, new StringBuilder(), result);
        return result;
    }
    private void backtrack(char[] chars, boolean[] used, StringBuilder path, ArrayList<String> result){
        if(path.length() == chars.length){
            result.add(path.toString());
            return;
        }
        for(int i=0; i<chars.length; i++){
            if(used[i]){
                continue;
            }
            if(i>0 && chars[i] == chars[i-1] && !used[i-1]){
                continue;
            }
            used[i]=true;
            path.append(chars[i]);
            backtrack(chars, used, path, result);
            path.deleteCharAt(path.length()-1);
            used[i]=false;
        }
    }
}