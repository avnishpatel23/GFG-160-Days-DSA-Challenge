// Search in a sorted Matrix


class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        int rows = mat.length;
        if(rows==0){
            return false;
        }
        int cols = mat[0].length;
        int low = 0, high = rows*cols-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int midElement=mat[mid/cols][mid%cols];
            if(midElement==x){
                return true;
            }
            else if(midElement<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
