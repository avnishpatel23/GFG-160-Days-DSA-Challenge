// Count pairs with given sum

class Solution {

    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int value : arr){
            int comp = target - value;
            if(map.containsKey(comp)){
                count += map.get(comp);
            }
            map.put(value, map.getOrDefault(value, 0)+1);
        }
        return count;
    }
}
