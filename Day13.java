// Day 13 - First Missing Positive


class Solution {
    // Function to find the smallest positive missing number
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int missing = 1;

        for (int num : arr) {
            if (num == missing) {
                missing++;
            }
        }

        return missing;
    }
}
