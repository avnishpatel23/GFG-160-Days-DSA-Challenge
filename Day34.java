// Allocate Minimum Pages

class Solution {
    static boolean check(int[] arr, int k, int limit){
        int count=1, sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]+sum > limit){
                count++;
                sum=arr[i];
            }else{
                sum+=arr[i];
            }
        }
        return (count<=k);
    }
    public static int findPages(int[] arr, int k) {
        if(k>arr.length) return -1;
        int lo=Arrays.stream(arr).max().getAsInt();
        int hi=Arrays.stream(arr).sum();
        int res=-1;
        while(lo<=hi){
             int mid = lo+(hi-lo)/2;
             if(check(arr,k,mid)){
                 res=mid;
                 hi=mid-1;
             }else{
                 lo=mid+1;
             }
         }
         return res;
    }
}