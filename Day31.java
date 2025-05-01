// Peak element

class Solution {

    public int peakElement(int[] arr) {
        // code here
        int l=arr.length;
        if(l==1){
          return 0;
        }
            if(arr[0]>=arr[1]){
                return 0;
            }
            if (arr[l-1]>=arr[l-2]){
                return l-1;
            }
            for (int i=1; i<l-1; i++){
                if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                    return i;
                }
            }
        return -1;
    }
}