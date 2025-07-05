// Day 29 - Minimum in a Sorted and Rotated Array

class Solution {
    public int findMin(int[] arr) {
        int i, min = arr[0];
        for(i=0; i<arr.length; i++)
        {
            if(arr[i]<min) min = arr[i];
        }
        return min;
    }
}
