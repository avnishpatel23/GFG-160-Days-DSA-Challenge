// Subarrays with sum K


class Solution {
    public int countSubarrays(int arr[], int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,1);
        for(int num : arr) {
            sum+=num;
            if(prefixSumMap.containsKey(sum-k)) {
                count+=prefixSumMap.get(sum-k);
            }
            prefixSumMap.put(sum,prefixSumMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}