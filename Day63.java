// Largest subarray of 0's and 1's

class Solution {
    public int maxLen(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum == 0){
                max = i+1;
            }
            if(map.containsKey(sum)){
                max = Math.max(max, i-map.get(sum));
            } else {
                map.put(sum,i);
            }
        }
        return max;
    }
}