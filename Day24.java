// Day 24 - Merge Overlapping Intervals


class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> ans = new ArrayList();
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        int str = arr[0][0], end = arr[0][1];
        for(int i=1; i<arr.length; i++){
            if(arr[i][0]<=end){
                end=Math.max(arr[i][1], end);
            }
            else{
                int[] a=new int[] {str, end};
                ans.add(a);
                str = arr[i][0];
                end = arr[i][1];
            }
        }
        int[] a=new int[] {str, end};
        ans.add(a);
        return ans;
    }
}
