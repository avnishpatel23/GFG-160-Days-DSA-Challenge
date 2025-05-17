// Longest Consecutive Subsequence

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int longestStreak=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}