// Day 12 - Maximum Sum Subarray in Circular


class Solution {
    // Function to find maximum circular subarray sum
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        
        int total = arr[0];
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        
        for (int i = 1; i < n; i++) {
            total += arr[i];
            
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            
            minEndingHere = Math.min(arr[i], minEndingHere + arr[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        
        if (maxSoFar < 0) {
            return maxSoFar;  // All elements are negative
        }
        
        return Math.max(maxSoFar, total - minSoFar);
    }
}
