// Pair with given sum in a sorted array


class Solution {

    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int result = 0;
        
        for(int i : arr){
            int complement = target - i;
            result += frequency.getOrDefault(complement, 0);
            frequency.put(i, frequency.getOrDefault(i, 0) + 1);
        }
        return result;
    }
}
