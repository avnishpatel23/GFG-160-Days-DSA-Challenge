// Day 1 - Second Largest Element in an Array //



class Solution {
    public int getSecondLargest(int[] arr) {
        int a = arr.length;
        if (a<2){
            return -1;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i=0; i<a; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        return(second==Integer.MIN_VALUE) ? -1 :second;
    }
}
