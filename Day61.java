// Equilibrium Point


class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int total = 0;
        for(int num : arr){
            total+=num;
        }
        int left = 0;
        for(int i = 0; i<arr.length; i++){
            total-=arr[i];
            if(left == total){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}