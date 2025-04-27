// Day 4 - Rotate an Array by d - Counterclockwise or Left //

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        int[] newarr = new int[n];
        for (int i=0; i<n; i++){
            newarr[i] = arr[d%n];
            d++;
        }
        for (int i=0; i<n; i++){
            arr[i] = newarr[i];
        }
    }
}
