import java.util.Arrays;

class Solution {

    // Function to find hIndex
    public int hIndex(int[] citations) {
        // Sort the citations array
        Arrays.sort(citations);

        int n = citations.length;
        int hIndex = 0;

        // Iterate through the sorted array from the back
        for (int i = 0; i < n; i++) {
            // Check if the current paper's citations are greater than or equal to the required h-index
            if (citations[i] >= n - i) {
                hIndex = n - i;  // Set the h-index
                break;
            }
        }

        return hIndex;
    }
}
